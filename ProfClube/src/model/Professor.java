package model;

import java.util.Date;

public class Professor extends Pessoa {
	
	private String curriculo;
	private String formacao;
	private String instituicao;
	private String projetos;
	private Date anoInicial;
	private Date anoFinal;
	
	public Professor(int matricula, String nome, int cpf, String email, int telefoneRes, int telefoneCel,
			java.sql.Date dataNascimento, java.sql.Date dataMatricula, String rg, String endereco, String bairro,
			String cidade, int cep, String comentarios, String nomepai, String nomemae, String curriculo,
			String formacao, String instituicao, String projetos, Date anoInicial, Date anoFinal) {

		super(matricula, nome, cpf, email, telefoneRes, telefoneCel, dataNascimento, dataMatricula, rg, endereco,
				bairro, cidade, cep, comentarios, nomepai, nomemae);
		this.curriculo = curriculo;
		this.formacao = formacao;
		this.instituicao = instituicao;
		this.projetos = projetos;
		this.anoInicial = anoInicial;
		this.anoFinal = anoFinal;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getProjetos() {
		return projetos;
	}

	public void setProjetos(String projetos) {
		this.projetos = projetos;
	}

	public Date getAnoInicial() {
		return anoInicial;
	}

	public void setAnoInicial(Date anoInicial) {
		this.anoInicial = anoInicial;
	}

	public Date getAnoFinal() {
		return anoFinal;
	}

	public void setAnoFinal(Date anoFinal) {
		this.anoFinal = anoFinal;
	}
	
	
	
}
