package com.emanuelgabriel.projetoresttemplateapi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuelgabriel.projetoresttemplateapi.model.NomeProduto;
import com.emanuelgabriel.projetoresttemplateapi.service.ProdutoService;

@RestController
@RequestMapping(value = "api/v1/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class NomeProdutoResource {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/{codigo}")
	public ResponseEntity<NomeProduto> obterNomeProduto(@PathVariable Long codigo) {
		NomeProduto produto = this.produtoService.obterPorId(codigo);
		return ResponseEntity.ok(produto);

	}

}
