package com.emanuelgabriel.projetoresttemplateapi.resource;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuelgabriel.projetoresttemplateapi.model.ResultadoDepesasDeputado;
import com.emanuelgabriel.projetoresttemplateapi.model.ResultadoDeputado;
import com.emanuelgabriel.projetoresttemplateapi.model.ResultadoDeputadoID;
import com.emanuelgabriel.projetoresttemplateapi.service.DeputadoService;

@RestController
@RequestMapping(value = "/api/v1/deputados", produces = MediaType.APPLICATION_JSON_VALUE)
public class DeputadoResource {

	@Autowired
	private DeputadoService deputadoService;

	@GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResultadoDeputadoID> buscarPorId(@PathVariable Integer id) {
		ResultadoDeputadoID deputado = this.deputadoService.buscarPorId(id);
		return ResponseEntity.ok(deputado);
	}

	@GetMapping
	public ResponseEntity<Optional<ResultadoDeputado>> listarTodos(@PathParam("nome") String nome,
			@PathParam("siglaUf") String siglaUf, @PathParam("siglaPartido") String siglaPartido) {
		Optional<ResultadoDeputado> resultado = this.deputadoService.listarTodos(nome, siglaUf, siglaPartido);
		return ResponseEntity.ok(resultado);
	}

	@GetMapping(value = "{id}/despesas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<ResultadoDepesasDeputado>> listarDespesasDeputados(@PathVariable Integer id,
			@PathParam("ano") String ano, @PathParam("mes") String mes,
			@PathParam("cnpjCpfFornecedor") String cnpjCpfFornecedor, @PathParam("ordem") String ordem,
			@PathParam("ordenarPor") String ordenarPor) {

		Optional<ResultadoDepesasDeputado> resultado = this.deputadoService.listarDespesasDeputado(id, ano, mes,
				cnpjCpfFornecedor, ordem, ordenarPor);
		return ResponseEntity.ok(resultado);
	}

}
