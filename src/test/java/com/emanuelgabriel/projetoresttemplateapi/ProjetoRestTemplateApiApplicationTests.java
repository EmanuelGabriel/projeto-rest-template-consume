package com.emanuelgabriel.projetoresttemplateapi;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.emanuelgabriel.projetoresttemplateapi.model.ResultadoDeputadoID;

@SpringBootTest
class ProjetoRestTemplateApiApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(ProjetoRestTemplateApiApplicationTests.class);

	@Test
	void consumerAPITrello() {

		// curl -X GET "
		// https://dadosabertos.camara.leg.br/
		// api/v2/deputados/1"
		// -H "accept: application/json"
		RestTemplate template = new RestTemplate();
		UriComponents uri = UriComponentsBuilder
				.newInstance()
				.scheme("https")
				.host("dadosabertos.camara.leg.br/")
				.path("api/v2/deputados")
				.queryParam("ordem", "ASC")
				.queryParam("ordenarPor", "nome").build();

		ResponseEntity<ResultadoDeputadoID> entidade = template.getForEntity(uri.toString(), ResultadoDeputadoID.class);
		log.info("Log/info:  " + entidade.getBody().getDados());

	}

}
