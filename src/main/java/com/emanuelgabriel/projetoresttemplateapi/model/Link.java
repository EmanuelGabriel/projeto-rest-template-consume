package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;

public class Link implements Serializable {

	private static final long serialVersionUID = 1L;

	private String rel;
	private String href;

	public Link() {
	}

	public Link(String rel, String href) {
		this.rel = rel;
		this.href = href;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}
