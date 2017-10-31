package controller;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaResultado extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaResultado() {
		setVisible(true);
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setForeground(Color.WHITE);
		setTitle("Consulta de Dados");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 771, 630);

		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBackground(UIManager.getColor("MenuBar.background"));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);

		JPanel panelBotao = new JPanel();
		panelBotao.setForeground(SystemColor.windowBorder);
		panelBotao.setBorder(new EmptyBorder(0, 0, 0, 0));

		JButton btnNewButton = new JButton("Consultar Relatório");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button = new JButton("Voltar");
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JPanel panelMes = new JPanel();
		panelMes.setBorder(new LineBorder(new Color(0, 0, 0)));

		JPanel panelAcumulado = new JPanel();
		panelAcumulado.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAcumulado.setLayout(null);

		JLabel lblNewLabel = new JLabel("Reservas");
		lblNewLabel.setForeground(UIManager.getColor("textText"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(20, 87, 90, 14);
		panelAcumulado.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(20, 100, 86, 20);
		panelAcumulado.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Noites");
		lblNewLabel_1.setForeground(UIManager.getColor("textText"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(140, 87, 84, 14);
		panelAcumulado.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(140, 100, 86, 20);
		panelAcumulado.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblValorUh = new JLabel("Di\u00E1ria");
		lblValorUh.setForeground(UIManager.getColor("textText"));
		lblValorUh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblValorUh.setBounds(260, 87, 92, 14);
		panelAcumulado.add(lblValorUh);

		textField_2 = new JTextField();
		textField_2.setBounds(260, 100, 86, 20);
		panelAcumulado.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblGatoExtra = new JLabel("Gasto Extra");
		lblGatoExtra.setForeground(UIManager.getColor("textText"));
		lblGatoExtra.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGatoExtra.setBounds(380, 87, 84, 14);
		panelAcumulado.add(lblGatoExtra);

		textField_3 = new JTextField();
		textField_3.setBounds(380, 100, 86, 20);
		panelAcumulado.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblRelatrio = new JLabel("Relat\u00F3rio Hotelaria Mensal - M\u00E9dia");

		JLabel lblRelatrioHotelariaAnual = new JLabel("Relat\u00F3rio Hotelaria Anual - Acumulado");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelAcumulado, GroupLayout.PREFERRED_SIZE, 726, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRelatrioHotelariaAnual)
						.addComponent(panelBotao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRelatrio)
								.addComponent(panelMes, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblRelatrioHotelariaAnual)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelAcumulado, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(60)
					.addComponent(lblRelatrio, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelMes, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(panelBotao, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);

		JLabel lblAno = new JLabel("Ano");
		lblAno.setForeground(UIManager.getColor("textText"));
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAno.setBounds(20, 21, 86, 14);
		panelAcumulado.add(lblAno);

		textField_4 = new JTextField();
		textField_4.setBounds(20, 35, 86, 20);
		panelAcumulado.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pessoas");
		lblNewLabel_2.setForeground(UIManager.getColor("textText"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(140, 21, 84, 14);
		panelAcumulado.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(140, 35, 86, 20);
		panelAcumulado.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Gasto Total");
		lblNewLabel_3.setForeground(UIManager.getColor("textText"));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(500, 87, 86, 14);
		panelAcumulado.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(500, 100, 86, 20);
		panelAcumulado.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ocupa\u00E7\u00E3o");
		lblNewLabel_4.setForeground(UIManager.getColor("textText"));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(620, 87, 82, 14);
		panelAcumulado.add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.setBounds(620, 100, 86, 20);
		panelAcumulado.add(textField_7);
		textField_7.setColumns(10);
		
		GroupLayout gl_panelBotao = new GroupLayout(panelBotao);
		gl_panelBotao.setHorizontalGroup(
			gl_panelBotao.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelBotao.createSequentialGroup()
					.addContainerGap(457, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelBotao.setVerticalGroup(
			gl_panelBotao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBotao.createSequentialGroup()
					.addGroup(gl_panelBotao.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(8))
		);
		panelBotao.setLayout(gl_panelBotao);
		panelMes.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 697, 218);
		panelMes.add(scrollPane);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Janeiro", null, null, null, null, null, null, null},
				{"Fevereiro", null, null, null, null, null, null, null},
				{"Mar\u00E7o", null, null, null, null, null, null, null},
				{"Abril", null, null, null, null, null, null, null},
				{"Maio", null, null, null, null, null, null, null},
				{"Junho", null, null, null, null, null, null, null},
				{"Julho", null, null, null, null, null, null, null},
				{"Agosto", null, null, null, null, null, null, null},
				{"Setembro", null, null, null, null, null, null, null},
				{"Outubro", null, null, null, null, null, null, null},
				{"Novembro", null, null, null, null, null, null, null},
				{"Dezembro", null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00EAs", "Pessoas", "Reservas", "Noites", "Di\u00E1ria", "Gasto Extra", "Gasto Total", "Ocupa\u00E7\u00E3o"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Integer.class, Double.class, Double.class, Double.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table_1);
		contentPane.setLayout(gl_contentPane);

	}
}
