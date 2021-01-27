package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultadoDepesasDeputado implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<DeputadoDespesa> dados = new ArrayList<>();
	private List<Link> links = new ArrayList<>();

	public ResultadoDepesasDeputado() {
	}

	public List<DeputadoDespesa> getDados() {
		return dados;
	}

	public List<Link> getLinks() {
		return links;
	}

}
