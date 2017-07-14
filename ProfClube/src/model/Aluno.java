package model;

import java.sql.Date;

public class Aluno extends Pessoa {
	
	private String periodo;
	private int nota;
	private String frequencia;

	
	public Aluno(int matricula, String nome, int cpf, String email, int telefoneRes, int telefoneCel,
			Date dataNascimento, Date dataMatricula, String rg, String endereco, String bairro, String cidade, int cep,
			String comentarios, String nomepai, String nomemae, String periodo, int nota, String frequencia) {

		super(matricula, nome, cpf, email, telefoneRes, telefoneCel, dataNascimento, dataMatricula, rg, endereco,
				bairro, cidade, cep, comentarios, nomepai, nomemae);
		this.periodo = periodo;
		this.nota = nota;
		this.frequencia = frequencia;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

}
