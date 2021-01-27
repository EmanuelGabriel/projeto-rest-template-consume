package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultadoDeputadoID implements Serializable {

	private static final long serialVersionUID = 1L;

	private DeputadoID dados;
	private List<Link> links = new ArrayList<>();

	public ResultadoDeputadoID() {
	}

	public DeputadoID getDados() {
		return dados;
	}

	public List<Link> getLinks() {
		return links;
	}

}
