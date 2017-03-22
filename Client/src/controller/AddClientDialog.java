package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AddClientDialog extends JDialog {
	//
	/**
	 * Construtor.
	 * 
	 * @param mainFrame
	 *            Janela principal.
	 */
	public AddClientDialog(MainFrame mainFrame) {
		build();
	}

	/**
	 * Constrói o diálogo.
	 * 
	 * @param mainFrame
	 *            Janela principal do sistema,
	 */
	private void build() {

		setLayout(new GridBagLayout());
		addbuildClient();
		pack();
		setMinimumSize(new Dimension(300, 200));
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

	}

	private void addbuildClient() {

		JPanel panel = new JPanel(new GridBagLayout());

		JLabel name = new JLabel("Nome:");
		panel.add(name, new GBC(0, 0));
		JTextField nameField = new JTextField(20);
		panel.add(nameField, new GBC(1, 0).horizontal());

		JLabel cpf = new JLabel("CPF:");
		panel.add(cpf, new GBC(0, 1));
		JTextField cpfField = new JTextField(20);
		panel.add(cpfField, new GBC(1, 1).horizontal());

		JLabel date_Nasc = new JLabel("Data Nascimento:");
		panel.add(date_Nasc, new GBC(0, 2));
		JTextField date_NascField = new JTextField(20);
		panel.add(date_NascField, new GBC(1, 2).horizontal());

		JButton save = new JButton("Salvar");
		panel.add(save, new GBC(1, 3).right());
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(save, "Salvo com sucesso.");

			}
		});

		add(panel, new GBC(0, 0).both());

	}

}
