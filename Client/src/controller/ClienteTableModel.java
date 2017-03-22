package controller;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import model.Cliente;

public class ClienteTableModel extends AbstractTableModel {

	private String[] columnName = { "Nome", "Cpf", "Data Nascimento" };
	private ArrayList<Cliente> clientlist = new ArrayList<Cliente>();

	public int getColumnCount() {
		return this.columnName.length;
	}

	public int getRowCount() {
		return this.clientlist.size();
	}

	public String getColumnName(int col) {
		return this.columnName[col];
	}

	public Object getValueAt(int row, int col) {
		switch (col) {
		case 0:
			return clientlist.get(row).getNome();
		case 1:
			return clientlist.get(row).getCpf();
		case 2:
			return clientlist.get(row).getDate();
		default:
			return null;
		}
	}
	
}