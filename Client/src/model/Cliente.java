package model;

import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cliente extends DefaultTableModel {

	private String nome;
	private String cpf;
	private String data;
	private int count;
	
	/**
	 * Classe cliente com seus atributos.
	 */
	public Cliente() {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDate() {
		return data;
	}

	public void setDate(String date) {
		data = data;
	}

}
