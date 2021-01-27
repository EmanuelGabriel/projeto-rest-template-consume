package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;

public class Gabinete implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String predio;
	private String sala;
	private String andar;
	private String telefone;
	private String email;

	public Gabinete() {
	}

	public Gabinete(String nome, String predio, String sala, String andar, String telefone, String email) {
		this.nome = nome;
		this.predio = predio;
		this.sala = sala;
		this.andar = andar;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPredio() {
		return predio;
	}

	public void setPredio(String predio) {
		this.predio = predio;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
