package model;

import java.util.Date;

public class Turma {
	
	private int codigo;
	private Curso codigoCurso;
	private Date anoLetivo;
	private String sala;
	private int totalHoras;
	private String horarioInicio;
	private String horarioFim;
	private int qtdAlunos;
	private Date dataInicio;
	private Date dataFim;
	
	public Turma(int codigo, Curso codigoCurso, Date anoLetivo, String sala, int totalHoras, String horarioInicio,
			String horarioFim, int qtdAlunos, Date dataInicio, Date dataFim) {
		super();
		this.codigo = codigo;
		this.codigoCurso = codigoCurso;
		this.anoLetivo = anoLetivo;
		this.sala = sala;
		this.totalHoras = totalHoras;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.qtdAlunos = qtdAlunos;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Curso codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public Date getAnoLetivo() {
		return anoLetivo;
	}

	public void setAnoLetivo(Date anoLetivo) {
		this.anoLetivo = anoLetivo;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	
}
