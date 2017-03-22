package controller;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Cliente;

public class ClienteTableModel extends DefaultTableModel {
	
	 ArrayList<Cliente> clientlist = new ArrayList<Cliente>();
	 String [] columnName = {"Nome","Cpf","Data Nascimento"};
	
	  	public int getColumnCount() {
	        return this.columnName.length;
	    }
	  	
	    public int getRowCount() {
	        return 0;
	    }
	    
	    public String getColumnName(int col) {
	        return this.columnName[col];
	    }
	    
	    public Object getValueAt(int row, int col) {
	        return 0;
	    }
	    
}
