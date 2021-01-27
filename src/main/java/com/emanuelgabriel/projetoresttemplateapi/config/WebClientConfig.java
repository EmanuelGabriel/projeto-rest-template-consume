package com.emanuelgabriel.projetoresttemplateapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
	
	private static final String BASE_URL = "http://localhost:8081/api/";
	private static final String BASE_URL_CAMARA_DEPUTADOS = "https://dadosabertos.camara.leg.br/api/";
	// https://dadosabertos.camara.leg.br/api/v2/deputados/204554
	
	// @Bean
	public WebClient webClientProdutos(WebClient.Builder builder) {
		return builder
			.baseUrl(BASE_URL)
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}

	@Bean
	public WebClient webClientCamaraDeputados(WebClient.Builder builder) {
		return builder
			.baseUrl(BASE_URL_CAMARA_DEPUTADOS)
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}
	
	
}
