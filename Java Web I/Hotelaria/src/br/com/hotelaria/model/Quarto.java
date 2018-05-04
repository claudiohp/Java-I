package br.com.hotelaria.model;

public class Quarto {
	
	private int idquarto;
	private int numeroQuarto;
	private int preco;
	private String estado;
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Quarto() {
		
	}

	public Quarto(int numeroQuarto) {
		
		this.numeroQuarto = numeroQuarto;
	}

	public int getIdquarto() {
		return idquarto;
	}

	public void setIdquarto(int idquarto) {
		this.idquarto = idquarto;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
}
