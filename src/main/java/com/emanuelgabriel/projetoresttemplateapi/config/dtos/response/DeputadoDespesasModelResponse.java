package com.emanuelgabriel.projetoresttemplateapi.config.dtos.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.emanuelgabriel.projetoresttemplateapi.model.DeputadoDespesa;

public class DeputadoDespesasModelResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<DeputadoDespesa> dados = new ArrayList<>();

	public DeputadoDespesasModelResponse() {
	}

	public List<DeputadoDespesa> getDados() {
		return dados;
	}

}
