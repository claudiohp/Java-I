package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MercadoFinanca extends JFrame {

	private JTable tabela;

	JPanel panel = new JPanel(new GridBagLayout());
	JPanel painelFundo;
	JScrollPane barraRolagem;

	public MercadoFinanca(MainFrame mainframe) {
		build();
	}

	Object[][] dados = { { "Petrobras", "10%", "11%","10%" },
			{ "Amazon", "9%", "10%","10%" },
			{ "Facebook", "8%", "7%","10%" } };

	String[] colunas = { "Empresa", "Taxa", "Taxa Alta","Taxa Baixa"};
	
	
	private void build() {

		setLayout(new GridBagLayout());
		pack();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		getColumnCount();
		buildTable();
	}
	
	private void buildTable() {
		panel.setLayout(new GridLayout(0, 1));
		getColumnCount();
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		panel.add(barraRolagem);

		setSize(500, 120);
		setVisible(true);

		add(panel, new GBC(0, 0).both());

	}
	
	public int getColumnCount() {
		return colunas.length;
	}
	
	
}
