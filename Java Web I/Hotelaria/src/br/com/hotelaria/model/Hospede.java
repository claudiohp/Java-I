package br.com.hotelaria.model;

public class Hospede {
	
	private int idhospede;
	private String nome;
	
	public Hospede() {
		
	}

	public Hospede(String nome) {
		this.nome = nome;
	}



	public int getIdhospede() {
		return idhospede;
	}
	
	public void setIdhospede(int idhospede) {
		this.idhospede = idhospede;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
