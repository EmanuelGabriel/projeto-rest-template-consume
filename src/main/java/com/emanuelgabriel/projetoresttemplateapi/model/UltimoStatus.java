package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;
import java.util.Date;

public class UltimoStatus implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String uri;
	private String nome;
	private String siglaPartido;
	private String uriPartido;
	private String siglaUf;
	private String idLegislatura;
	private String urlFoto;
	private String email;
	private Date data;
	private String nomeEleitoral;
	private Gabinete gabinete;
	private String situacao;
	private String condicaoEleitoral;
	private String descricaoStatus;

	public UltimoStatus() {
	}

	public UltimoStatus(Integer id, String uri, String nome, String siglaPartido, String uriPartido, String siglaUf,
			String idLegislatura, String urlFoto, String email, Date data, String nomeEleitoral, Gabinete gabinete,
			String situacao, String condicaoEleitoral, String descricaoStatus) {
		this.id = id;
		this.uri = uri;
		this.nome = nome;
		this.siglaPartido = siglaPartido;
		this.uriPartido = uriPartido;
		this.siglaUf = siglaUf;
		this.idLegislatura = idLegislatura;
		this.urlFoto = urlFoto;
		this.email = email;
		this.data = data;
		this.nomeEleitoral = nomeEleitoral;
		this.gabinete = gabinete;
		this.situacao = situacao;
		this.condicaoEleitoral = condicaoEleitoral;
		this.descricaoStatus = descricaoStatus;
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

	public String getIdLegislatura() {
		return idLegislatura;
	}

	public void setIdLegislatura(String idLegislatura) {
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNomeEleitoral() {
		return nomeEleitoral;
	}

	public void setNomeEleitoral(String nomeEleitoral) {
		this.nomeEleitoral = nomeEleitoral;
	}

	public Gabinete getGabinete() {
		return gabinete;
	}

	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getCondicaoEleitoral() {
		return condicaoEleitoral;
	}

	public void setCondicaoEleitoral(String condicaoEleitoral) {
		this.condicaoEleitoral = condicaoEleitoral;
	}

	public String getDescricaoStatus() {
		return descricaoStatus;
	}

	public void setDescricaoStatus(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
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
		UltimoStatus other = (UltimoStatus) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
