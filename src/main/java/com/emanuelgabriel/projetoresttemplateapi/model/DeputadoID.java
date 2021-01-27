package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeputadoID implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String cpf;
	private String dataFalecimento;
	private String dataNascimento;
	private String escolaridade;
	private String municipioNascimento;
	private String nomeCivil;
	private String sexo;
	private String ufNascimento;
	private String uri;
	private String urlWebsite;
	private UltimoStatus ultimoStatus;

	public DeputadoID() {
	}

	public DeputadoID(Integer id, String cpf, String dataFalecimento, String dataNascimento, String escolaridade,
			String municipioNascimento, String nomeCivil, String sexo, String ufNascimento, String uri,
			String urlWebsite) {
		this.id = id;
		this.cpf = cpf;
		this.dataFalecimento = dataFalecimento;
		this.dataNascimento = dataNascimento;
		this.escolaridade = escolaridade;
		this.municipioNascimento = municipioNascimento;
		this.nomeCivil = nomeCivil;
		this.sexo = sexo;
		this.ufNascimento = ufNascimento;
		this.uri = uri;
		this.urlWebsite = urlWebsite;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(String dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getMunicipioNascimento() {
		return municipioNascimento;
	}

	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}

	public String getNomeCivil() {
		return nomeCivil;
	}

	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUfNascimento() {
		return ufNascimento;
	}

	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUrlWebsite() {
		return urlWebsite;
	}

	public void setUrlWebsite(String urlWebsite) {
		this.urlWebsite = urlWebsite;
	}

	public UltimoStatus getUltimoStatus() {
		return ultimoStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeputadoID other = (DeputadoID) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
