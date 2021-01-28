package com.emanuelgabriel.projetoresttemplateapi.config.dtos.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.emanuelgabriel.projetoresttemplateapi.model.DeputadoDespesa;
import com.emanuelgabriel.projetoresttemplateapi.model.Link;

public class DeputadoDespesasModelResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<DeputadoDespesa> dados = new ArrayList<>();
	private List<Link> links = new ArrayList<>();

	public DeputadoDespesasModelResponse() {
	}

	public List<DeputadoDespesa> getDados() {
		return dados;
	}

	public List<Link> getLinks() {
		return links;
	}

}
