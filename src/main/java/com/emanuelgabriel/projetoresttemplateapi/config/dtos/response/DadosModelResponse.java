package com.emanuelgabriel.projetoresttemplateapi.config.dtos.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.emanuelgabriel.projetoresttemplateapi.model.DeputadoID;

public class DadosModelResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<DeputadoID> dados = new ArrayList<>();

	public DadosModelResponse() {
	}
	
	public List<DeputadoID> getDados() {
		return dados;
	}

	public void setDados(List<DeputadoID> dados) {
		this.dados = dados;
	}

}
