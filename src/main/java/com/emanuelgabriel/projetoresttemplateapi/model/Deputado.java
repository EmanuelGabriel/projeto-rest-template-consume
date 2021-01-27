package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deputado implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String uri;

	private String nome;

	private String siglaPartido;

	private String uriPartido;

	private String siglaUf;

	private Long idLegislatura;

	private String urlFoto;

	private String email;

	public Deputado() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public String getUriPartido() {
		return uriPartido;
	}

	public void setUriPartido(String uriPartido) {
		this.uriPartido = uriPartido;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public Long getIdLegislatura() {
		return idLegislatura;
	}

	public void setIdLegislatura(Long idLegislatura) {
		this.idLegislatura = idLegislatura;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Deputado other = (Deputado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
