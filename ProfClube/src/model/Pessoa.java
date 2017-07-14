package model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Pessoa {
	
	/**
	 * Atributos de Pessoa.
	 */
	private int matricula;
	private String nome;
	private int cpf;
	private String email;
	private int telefoneRes;
	private int telefoneCel;
	private Date dataNascimento;
	private Date dataMatricula;
	private String rg;
	private String endereco;
	private String bairro;
	private String cidade;
	private int cep;
	private String comentarios;
	private String nomepai;
	private String nomemae;
	
	/**
	 * Construtor de Pessoa.
	 */
	
	public Pessoa(int matricula, String nome){
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Pessoa(int matricula, String nome, int cpf, String email, int telefoneRes, int telefoneCel,
			Date dataNascimento, Date dataMatricula, String rg, String endereco, String bairro, String cidade, int cep,
			String comentarios, String nomepai, String nomemae) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefoneRes = telefoneRes;
		this.telefoneCel = telefoneCel;
		this.dataNascimento = dataNascimento;
		this.dataMatricula = dataMatricula;
		this.rg = rg;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.comentarios = comentarios;
		this.nomepai = nomepai;
		this.nomemae = nomemae;
	}
	
	/**
	 * Métodos públicos getters and setters.
	 * @return
	 */

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefoneRes() {
		return telefoneRes;
	}

	public void setTelefoneRes(int telefoneRes) {
		this.telefoneRes = telefoneRes;
	}

	public int getTelefoneCel() {
		return telefoneCel;
	}

	public void setTelefoneCel(int telefoneCel) {
		this.telefoneCel = telefoneCel;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getNomepai() {
		return nomepai;
	}

	public void setNomepai(String nomepai) {
		this.nomepai = nomepai;
	}

	public String getNomemae() {
		return nomemae;
	}

	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}

}
