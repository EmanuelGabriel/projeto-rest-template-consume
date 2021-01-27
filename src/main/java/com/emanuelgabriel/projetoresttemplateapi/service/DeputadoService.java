package com.emanuelgabriel.projetoresttemplateapi.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.emanuelgabriel.projetoresttemplateapi.model.ResultadoDepesasDeputado;
import com.emanuelgabriel.projetoresttemplateapi.model.ResultadoDeputado;
import com.emanuelgabriel.projetoresttemplateapi.model.ResultadoDeputadoID;
import com.emanuelgabriel.projetoresttemplateapi.service.exception.BadRequestException;

import reactor.core.publisher.Mono;

@Service
public class DeputadoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DeputadoService.class);
	
	@Autowired
	private WebClient webClientDeputados;

	public ResultadoDeputadoID buscarPorId(Integer id) {

		Mono<ResultadoDeputadoID> monoDeputado = this.webClientDeputados.method(HttpMethod.GET)
				.uri("v2/deputados/{id}", id)
				.retrieve()
				.bodyToMono(ResultadoDeputadoID.class);
		
		ResultadoDeputadoID deputadoID = monoDeputado.block();
		if (deputadoID == null) {
			throw new BadRequestException("Deputado não encontrado");
		}
		
		return deputadoID;
	}

	// https://dadosabertos.camara.leg.br/api/v2/deputados/188097/despesas?ordem=ASC&ordenarPor=ano
	public Optional<ResultadoDepesasDeputado> listarDespesasDeputado(Integer id, String ano, String mes, String cnpjCpfFornecedor, String ordem, String ordenarPor) {
		
		Mono<ResultadoDepesasDeputado> listaMono = this.webClientDeputados
				.get()
				.uri(p -> p.path("v2/deputados/" + id + "/despesas")
						.queryParam("ano", ano)
						.queryParam("mes", mes)
						.queryParam("cnpjCpfFornecedor", cnpjCpfFornecedor)
						.queryParam("ordem", ordem)
						.queryParam("ordenarPor", ordenarPor)
						.build())
				.retrieve()
				.onStatus(httpStatus -> HttpStatus.NOT_FOUND.equals(httpStatus), clientResponse -> Mono.empty())
				.bodyToMono(ResultadoDepesasDeputado.class);

		Optional<ResultadoDepesasDeputado> lista = listaMono.blockOptional();
		LOGGER.debug("Despesas dos Deputados ", lista);
		return lista;

	}

	public Optional<ResultadoDeputado> listarTodos(String nome, String siglaUf, String siglaPartido) {

		Mono<ResultadoDeputado> listaMono = this.webClientDeputados.method(HttpMethod.GET)
				.uri(param -> param.path("v2/deputados/")
						.queryParam("nome", nome)
						.queryParam("siglaUf", siglaUf)
						.queryParam("siglaPartido", siglaPartido).build())
				.retrieve().bodyToMono(ResultadoDeputado.class);

		Optional<ResultadoDeputado> lista = listaMono.blockOptional();
		return lista;

	}

}
