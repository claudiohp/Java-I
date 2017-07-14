package model;

public class Curso {
	
	private int codigo;
	private String nome;
	private String cargaHoraria;
	private double taxaMatricula;
	private double valorCurso;
	private int parcelas;
	private double valorTotal;
	private String observacoes;
	private String tipo;
	
	public Curso(String nome){
		this.nome = nome;
	}
	
	public Curso(int codigo, String nome, String cargaHoraria, double taxaMatricula, double valorCurso, int parcelas,
			double valorTotal, String observacoes, String tipo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.taxaMatricula = taxaMatricula;
		this.valorCurso = valorCurso;
		this.parcelas = parcelas;
		this.valorTotal = valorTotal;
		this.observacoes = observacoes;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getTaxaMatricula() {
		return taxaMatricula;
	}

	public void setTaxaMatricula(double taxaMatricula) {
		this.taxaMatricula = taxaMatricula;
	}

	public double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
}
