package model;

import java.sql.Date;

public class Inscricao {
	
	private int codigoInscricao;
	private Date dataInscricao;
	private Date dataAprovacao;
	private int qtdLimite;
	private String periodoReferencia;
	
	public Inscricao(int codigoInscricao, Date dataInscricao, Date dataAprovacao, int qtdLimite,
			String periodoReferencia) {
		super();
		this.codigoInscricao = codigoInscricao;
		this.dataInscricao = dataInscricao;
		this.dataAprovacao = dataAprovacao;
		this.qtdLimite = qtdLimite;
		this.periodoReferencia = periodoReferencia;
	}

	public int getCodigoInscricao() {
		return codigoInscricao;
	}

	public void setCodigoInscricao(int codigoInscricao) {
		this.codigoInscricao = codigoInscricao;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public Date getDataAprovacao() {
		return dataAprovacao;
	}

	public void setDataAprovacao(Date dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}

	public int getQtdLimite() {
		return qtdLimite;
	}

	public void setQtdLimite(int qtdLimite) {
		this.qtdLimite = qtdLimite;
	}

	public String getPeriodoReferencia() {
		return periodoReferencia;
	}

	public void setPeriodoReferencia(String periodoReferencia) {
		this.periodoReferencia = periodoReferencia;
	}
	
	
}
