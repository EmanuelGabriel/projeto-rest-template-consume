package com.emanuelgabriel.projetoresttemplateapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.emanuelgabriel.projetoresttemplateapi.model.NomeProduto;

import reactor.core.publisher.Mono;

@Service
public class ProdutoService {

	// http://localhost:8081/api/v1/produtos/{id}

	@Autowired
	private WebClient webClientProdutos;

	public NomeProduto obterPorId(Long codigo) {

		Mono<NomeProduto> monoProduto = this.webClientProdutos
				.method(HttpMethod.GET).uri("v1/produtos/{codigo}", codigo)
				.retrieve().bodyToMono(NomeProduto.class);

		NomeProduto produto = monoProduto.block();

		return produto;
	}

}
