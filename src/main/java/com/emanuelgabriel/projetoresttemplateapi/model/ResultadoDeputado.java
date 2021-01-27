package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultadoDeputado implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Deputado> dados = new ArrayList<>();

	private List<Link> links = new ArrayList<>();

	public ResultadoDeputado() {
	}

	public List<Deputado> getDados() {
		return dados;
	}

	public List<Link> getLinks() {
		return links;
	}

}
