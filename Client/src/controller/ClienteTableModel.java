package controller;

import javax.swing.table.DefaultTableModel;

public class ClienteTableModel extends DefaultTableModel {
	
	
	String [] columnName = {"Nome","Cpf","Data Nascimento"};
	
	  public int getColumnCount() {
	        return columnName.length;
	    }

	    public int getRowCount() {
	        return 0;
	    }

	    public String getColumnName(int col) {
	        return columnName[col];
	    }

	    public Object getValueAt(int row, int col) {
	        return 0;
	    }

	    public Class getColumnClass(int c) {
	        return getValueAt(0, c).getClass();
	    }

}
