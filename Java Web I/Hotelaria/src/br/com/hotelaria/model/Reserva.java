package br.com.hotelaria.model;

import java.util.ArrayList;

public class Reserva {
	
	private int idreserva;
	private String dataEntrada;
	private String dataSaida;
	private ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	private ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
	
	public Reserva() {
		
	}
	
	public Reserva(String dataEntrada, String dataSaida) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		
	}

	public int getIdreserva() {
		return idreserva;
	}
	
	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public ArrayList<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(ArrayList<Quarto> quartos) {
		this.quartos = quartos;
	}

	public ArrayList<Hospede> getHospedes() {
		return hospedes;
	}

	public void setHospedes(ArrayList<Hospede> hospedes) {
		this.hospedes = hospedes;
	}
	 
	
}
