package com.emanuelgabriel.projetoresttemplateapi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeputadoDespesa implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ano;
	private String cnpjCpfFornecedor;
	private Integer codDocumento;
	private Integer codLote;
	private Integer codTipoDocumento;
	private String dataDocumento;
	private Integer mes;
	private String nomeFornecedor;
	private String numDocumento;
	private String numRessarcimento;
	private Integer parcela;
	private String tipoDespesa;
	private String tipoDocumento;
	private String urlDocumento;
	private BigDecimal valorDocumento;
	private BigDecimal valorGlosa;
	private BigDecimal valorLiquido;

	public DeputadoDespesa() {
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCnpjCpfFornecedor() {
		return cnpjCpfFornecedor;
	}

	public void setCnpjCpfFornecedor(String cnpjCpfFornecedor) {
		this.cnpjCpfFornecedor = cnpjCpfFornecedor;
	}

	public Integer getCodDocumento() {
		return codDocumento;
	}

	public void setCodDocumento(Integer codDocumento) {
		this.codDocumento = codDocumento;
	}

	public Integer getCodLote() {
		return codLote;
	}

	public void setCodLote(Integer codLote) {
		this.codLote = codLote;
	}

	public Integer getCodTipoDocumento() {
		return codTipoDocumento;
	}

	public void setCodTipoDocumento(Integer codTipoDocumento) {
		this.codTipoDocumento = codTipoDocumento;
	}

	public String getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(String dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNumRessarcimento() {
		return numRessarcimento;
	}

	public void setNumRessarcimento(String numRessarcimento) {
		this.numRessarcimento = numRessarcimento;
	}

	public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getUrlDocumento() {
		return urlDocumento;
	}

	public void setUrlDocumento(String urlDocumento) {
		this.urlDocumento = urlDocumento;
	}

	public BigDecimal getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(BigDecimal valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public BigDecimal getValorGlosa() {
		return valorGlosa;
	}

	public void setValorGlosa(BigDecimal valorGlosa) {
		this.valorGlosa = valorGlosa;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

}
