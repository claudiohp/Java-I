package controller;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import antlr.ParserSharedInputState;
import model.Hospedagem;
import model.dao.HospedagemDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.management.modelmbean.ModelMBeanOperationInfo;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaResultado extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField fieldReservas;
	private JTextField fieldNoites;
	private JTextField fieldDiaria;
	private JTextField fieldGastoExtra;
	private JTable table_1;
	private JTextField fieldAno;
	private JTextField fieldPessoas;
	private JTextField fieldGastoTotal;
	private JTextField fieldOcupacao;
	DefaultTableModel modelo = new DefaultTableModel();
	DecimalFormat formato = new DecimalFormat("#.##");

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

		JButton btnNewButton = new JButton("Gerar Relat\u00F3rio");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// new ManipulaCliente().carregarMediaClientes();
				carregarDadosMesTabela();
				carregaDadosAnoTabela();
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

		fieldReservas = new JTextField();
		fieldReservas.setBounds(20, 100, 86, 20);
		panelAcumulado.add(fieldReservas);
		fieldReservas.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Noites");
		lblNewLabel_1.setForeground(UIManager.getColor("textText"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(140, 87, 84, 14);
		panelAcumulado.add(lblNewLabel_1);

		fieldNoites = new JTextField();
		fieldNoites.setBounds(140, 100, 86, 20);
		panelAcumulado.add(fieldNoites);
		fieldNoites.setColumns(10);

		JLabel lblValorUh = new JLabel("Di\u00E1ria");
		lblValorUh.setForeground(UIManager.getColor("textText"));
		lblValorUh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblValorUh.setBounds(260, 87, 92, 14);
		panelAcumulado.add(lblValorUh);

		fieldDiaria = new JTextField();
		fieldDiaria.setBounds(260, 100, 86, 20);
		panelAcumulado.add(fieldDiaria);
		fieldDiaria.setColumns(10);

		JLabel lblGatoExtra = new JLabel("Gasto Extra");
		lblGatoExtra.setForeground(UIManager.getColor("textText"));
		lblGatoExtra.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGatoExtra.setBounds(380, 87, 84, 14);
		panelAcumulado.add(lblGatoExtra);

		fieldGastoExtra = new JTextField();
		fieldGastoExtra.setBounds(380, 100, 86, 20);
		panelAcumulado.add(fieldGastoExtra);
		fieldGastoExtra.setColumns(10);

		JLabel lblRelatrio = new JLabel("Relat\u00F3rio Hotelaria Mensal - M\u00E9dia");

		JLabel lblRelatrioHotelariaAnual = new JLabel("Relat\u00F3rio Hotelaria Anual - Acumulado");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelAcumulado, GroupLayout.PREFERRED_SIZE, 726, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRelatrioHotelariaAnual)
						.addComponent(panelBotao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRelatrio).addComponent(panelMes, GroupLayout.PREFERRED_SIZE,
												719, GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(21, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(22).addComponent(lblRelatrioHotelariaAnual)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelAcumulado, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGap(60)
						.addComponent(lblRelatrio, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelMes, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
						.addComponent(panelBotao, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		JLabel lblAno = new JLabel("Ano");
		lblAno.setForeground(UIManager.getColor("textText"));
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAno.setBounds(20, 21, 86, 14);
		panelAcumulado.add(lblAno);

		fieldAno = new JTextField();
		fieldAno.setBounds(20, 35, 86, 20);
		panelAcumulado.add(fieldAno);
		fieldAno.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Pessoas");
		lblNewLabel_2.setForeground(UIManager.getColor("textText"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(140, 21, 84, 14);
		panelAcumulado.add(lblNewLabel_2);

		fieldPessoas = new JTextField();
		fieldPessoas.setBounds(140, 35, 86, 20);
		panelAcumulado.add(fieldPessoas);
		fieldPessoas.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Gasto Total");
		lblNewLabel_3.setForeground(UIManager.getColor("textText"));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(500, 87, 86, 14);
		panelAcumulado.add(lblNewLabel_3);

		fieldGastoTotal = new JTextField();
		fieldGastoTotal.setBounds(500, 100, 86, 20);
		panelAcumulado.add(fieldGastoTotal);
		fieldGastoTotal.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Ocupa\u00E7\u00E3o");
		lblNewLabel_4.setForeground(UIManager.getColor("textText"));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(620, 87, 82, 14);
		panelAcumulado.add(lblNewLabel_4);

		fieldOcupacao = new JTextField();
		fieldOcupacao.setBounds(620, 100, 86, 20);
		panelAcumulado.add(fieldOcupacao);
		fieldOcupacao.setColumns(10);

		GroupLayout gl_panelBotao = new GroupLayout(panelBotao);
		gl_panelBotao.setHorizontalGroup(gl_panelBotao.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelBotao.createSequentialGroup().addContainerGap(457, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(button, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panelBotao.setVerticalGroup(gl_panelBotao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBotao.createSequentialGroup()
						.addGroup(gl_panelBotao.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGap(8)));
		panelBotao.setLayout(gl_panelBotao);
		panelMes.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 697, 218);
		panelMes.add(scrollPane);

		table_1 = new JTable(modelo);
		scrollPane.setViewportView(table_1);
		contentPane.setLayout(gl_contentPane);
		
		modelo.addColumn("Mês");
		modelo.addColumn("Pessoas");
		modelo.addColumn("Reservas");
		modelo.addColumn("Noites");
		modelo.addColumn("Diária");
		modelo.addColumn("Gasto Extra");
		modelo.addColumn("Gasto Total");
		modelo.addColumn("Ocupação");

	}

	public void carregarDadosMesTabela() {

		HospedagemDAO hospedagemDao = HospedagemDAO.getInstancia();
		List<Hospedagem> hospedagemlist = hospedagemDao.searchAll(Hospedagem.class);

		double mediaPessoasJan = 0.0f;
		int mediaHospedesJan = 0;
		int mediaNoitesJan = 0;
		double mediaDiariaJan = 0.0f;
		double mediaGastoExtraJan = 0.0f;
		double mediaGastoTotalJan = 0.0f;
		int mediaOcupacaoJan = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Janeiro")) {
				mediaPessoasJan = mediaPessoasJan + 1;
				mediaHospedesJan += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesJan += hospedagem.getQtd_noites();
				mediaDiariaJan += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraJan += hospedagem.getGasto_extra();
				mediaOcupacaoJan += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasJan = mediaPessoasJan / 31;
		mediaDiariaJan = mediaDiariaJan / 31;
		mediaGastoExtraJan = mediaGastoExtraJan / 31;
		int strPessoasJan = (int) mediaPessoasJan;
		String strDiarioJan = formato.format(mediaDiariaJan);
		String strExtraJan = formato.format(mediaGastoExtraJan);
		mediaGastoTotalJan = mediaDiariaJan + mediaGastoExtraJan;
		String strGastoTotalJan = formato.format(mediaGastoTotalJan);

		modelo.addRow(new Object[] { "Janeiro", strPessoasJan, mediaHospedesJan / 31, mediaNoitesJan / 31, strDiarioJan,
				strExtraJan, strGastoTotalJan, mediaOcupacaoJan / 31 });

		double mediaPessoasFev = 0.0f;
		int mediaHospedesFev = 0;
		int mediaNoitesFev = 0;
		double mediaDiariaFev = 0.0f;
		double mediaGastoExtraFev = 0.0f;
		double mediaGastoTotalFev = 0.0f;
		int mediaOcupacaoFev = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Fevereiro")) {
				mediaPessoasFev = mediaPessoasFev + 1;
				mediaHospedesFev += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesFev += hospedagem.getQtd_noites();
				mediaDiariaFev += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraFev += hospedagem.getGasto_extra();
				mediaOcupacaoFev += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasFev = mediaPessoasFev / 31;
		mediaDiariaFev = mediaDiariaFev / 31;
		mediaGastoExtraFev = mediaGastoExtraFev / 31;
		int strPessoasFev = (int) mediaPessoasFev;
		String strDiarioFev = formato.format(mediaDiariaFev);
		String strExtraFev = formato.format(mediaGastoExtraFev);
		mediaGastoTotalFev = mediaDiariaFev + mediaGastoExtraFev;
		String strGastoTotal = formato.format(mediaGastoTotalFev);

		modelo.addRow(new Object[] { "Fevereiro", strPessoasFev, mediaHospedesFev / 31, mediaNoitesFev / 31,
				strDiarioFev, strExtraFev, strGastoTotal, mediaOcupacaoFev / 31 });

		double mediaPessoasMar = 0.0f;
		int mediaHospedesMar = 0;
		int mediaNoitesMar = 0;
		double mediaDiariaMar = 0.0f;
		double mediaGastoExtraMar = 0.0f;
		double mediaGastoTotalMar = 0.0f;
		int mediaOcupacaoMar = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Março")) {
				mediaPessoasMar = mediaPessoasMar + 1;
				mediaHospedesMar += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesMar += hospedagem.getQtd_noites();
				mediaDiariaMar += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraMar += hospedagem.getGasto_extra();
				mediaOcupacaoMar += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasMar = mediaPessoasMar / 31;
		mediaDiariaMar = mediaDiariaMar / 31;
		mediaGastoExtraMar = mediaGastoExtraMar / 31;
		int strPessoasMar = (int) mediaPessoasMar;
		String strDiarioMar = formato.format(mediaDiariaMar);
		String strExtraMar = formato.format(mediaGastoExtraMar);
		mediaGastoTotalMar = mediaDiariaMar + mediaGastoExtraMar;
		String strGastoTotalMar = formato.format(mediaGastoTotalMar);

		modelo.addRow(new Object[] { "Março", strPessoasMar, mediaHospedesMar / 31, mediaNoitesMar / 31, strDiarioMar,
				strExtraMar, strGastoTotalMar, mediaOcupacaoMar / 31 });

		double mediaPessoasAbr = 0.0f;
		int mediaHospedesAbr = 0;
		int mediaNoitesAbr = 0;
		double mediaDiariaAbr = 0.0f;
		double mediaGastoExtraAbr = 0.0f;
		double mediaGastoTotalAbr = 0.0f;
		int mediaOcupacaoAbr = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Abril")) {
				mediaPessoasAbr = mediaPessoasAbr + 1;
				mediaHospedesAbr += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesAbr += hospedagem.getQtd_noites();
				mediaDiariaAbr += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraAbr += hospedagem.getGasto_extra();
				mediaOcupacaoAbr += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasAbr = mediaPessoasAbr / 31;
		mediaDiariaAbr = mediaDiariaAbr / 31;
		mediaGastoExtraAbr = mediaGastoExtraAbr / 31;
		int strPessoasAbr = (int) mediaPessoasAbr;
		String strDiarioAbr = formato.format(mediaDiariaAbr);
		String strExtraAbr = formato.format(mediaGastoExtraAbr);
		mediaGastoTotalAbr = mediaDiariaAbr + mediaGastoExtraAbr;
		String strGastoTotalAbr = formato.format(mediaGastoTotalAbr);

		modelo.addRow(new Object[] { "Abril", strPessoasAbr, mediaHospedesAbr / 31, mediaNoitesAbr / 31, strDiarioAbr,
				strExtraAbr, strGastoTotalAbr, mediaOcupacaoAbr / 31 });

		double mediaPessoasMai = 0.0f;
		int mediaHospedesMai = 0;
		int mediaNoitesMai = 0;
		double mediaDiariaMai = 0.0f;
		double mediaGastoExtraMai = 0.0f;
		double mediaGastoTotalMai = 0.0f;
		int mediaOcupacaoMai = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Maio")) {
				mediaPessoasMai = mediaPessoasMai + 1;
				mediaHospedesMai += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesMai += hospedagem.getQtd_noites();
				mediaDiariaMai += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraMai += hospedagem.getGasto_extra();
				mediaOcupacaoMai += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasMai = mediaPessoasMai / 31;
		mediaDiariaMai = mediaDiariaMai / 31;
		mediaGastoExtraMai = mediaGastoExtraMai / 31;
		int strPessoasMai = (int) mediaPessoasMai;
		String strDiarioMai = formato.format(mediaDiariaMai);
		String strExtraMai = formato.format(mediaGastoExtraMai);
		mediaGastoTotalMai = mediaDiariaMai + mediaGastoExtraMai;
		String strGastoTotalMai = formato.format(mediaGastoTotalMai);

		modelo.addRow(new Object[] { "Maio", strPessoasMai, mediaHospedesMai / 31, mediaNoitesMai / 31, strDiarioMai,
				strExtraMai, strGastoTotalMai, mediaOcupacaoMai / 31 });

		double mediaPessoasJun = 0.0f;
		int mediaHospedesJun = 0;
		int mediaNoitesJun = 0;
		double mediaDiariaJun = 0.0f;
		double mediaGastoExtraJun = 0.0f;
		double mediaGastoTotalJun = 0.0f;
		int mediaOcupacaoJun = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Junho")) {
				mediaPessoasJun = mediaPessoasJun + 1;
				mediaHospedesJun += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesJun += hospedagem.getQtd_noites();
				mediaDiariaJun += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraJun += hospedagem.getGasto_extra();
				mediaOcupacaoJun += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasJun = mediaPessoasJun / 31;
		mediaDiariaJun = mediaDiariaJun / 31;
		mediaGastoExtraJun = mediaGastoExtraJun / 31;
		int strPessoasJun = (int) mediaPessoasJun;
		String strDiarioJun = formato.format(mediaDiariaJun);
		String strExtraJun = formato.format(mediaGastoExtraJun);
		mediaGastoTotalJun = mediaDiariaJun + mediaGastoExtraJun;
		String strGastoTotalJun = formato.format(mediaGastoTotalJun);

		modelo.addRow(new Object[] { "Junho", strPessoasJun, mediaHospedesJun / 31, mediaNoitesJun / 31, strDiarioJun,
				strExtraJun, strGastoTotalJun, mediaOcupacaoJun / 31 });

		double mediaPessoasJul = 0.0f;
		int mediaHospedesJul = 0;
		int mediaNoitesJul = 0;
		double mediaDiariaJul = 0.0f;
		double mediaGastoExtraJul = 0.0f;
		double mediaGastoTotalJul = 0.0f;
		int mediaOcupacaoJul = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Julho")) {
				mediaPessoasJul = mediaPessoasJul + 1;
				mediaHospedesJul += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesJul += hospedagem.getQtd_noites();
				mediaDiariaJul += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraJul += hospedagem.getGasto_extra();
				mediaOcupacaoJul += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasJul = mediaPessoasJul / 31;
		mediaDiariaJul = mediaDiariaJul / 31;
		mediaGastoExtraJul = mediaGastoExtraJul / 31;
		int strPessoasJul = (int) mediaPessoasJul;
		String strDiarioJul = formato.format(mediaDiariaJul);
		String strExtraJul = formato.format(mediaGastoExtraJul);
		mediaGastoTotalJul = mediaDiariaJul + mediaGastoExtraJul;
		String strGastoTotalJul = formato.format(mediaGastoTotalJul);

		modelo.addRow(new Object[] { "Julho", strPessoasJul, mediaHospedesJul / 31, mediaNoitesJul / 31, strDiarioJul,
				strExtraJul, strGastoTotalJul, mediaOcupacaoJul / 31 });

		double mediaPessoasAgo = 0.0f;
		int mediaHospedesAgo = 0;
		int mediaNoitesAgo = 0;
		double mediaDiariaAgo = 0.0f;
		double mediaGastoExtraAgo = 0.0f;
		double mediaGastoTotalAgo = 0.0f;
		int mediaOcupacaoAgo = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Agosto")) {
				mediaPessoasAgo = mediaPessoasAgo + 1;
				mediaHospedesAgo += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesAgo += hospedagem.getQtd_noites();
				mediaDiariaAgo += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraAgo += hospedagem.getGasto_extra();
				mediaOcupacaoAgo += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasAgo = mediaPessoasAgo / 31;
		mediaDiariaAgo = mediaDiariaAgo / 31;
		mediaGastoExtraAgo = mediaGastoExtraAgo / 31;
		int strPessoasAgo = (int) mediaPessoasAgo;
		String strDiarioAgo = formato.format(mediaDiariaAgo);
		String strExtraAgo = formato.format(mediaGastoExtraAgo);
		mediaGastoTotalAgo = mediaDiariaAgo + mediaGastoExtraAgo;
		String strGastoTotalAgo = formato.format(mediaGastoTotalAgo);

		modelo.addRow(new Object[] { "Agosto", strPessoasAgo, mediaHospedesAgo / 31, mediaNoitesAgo / 31, strDiarioAgo,
				strExtraAgo, strGastoTotalAgo, mediaOcupacaoAgo / 31 });

		double mediaPessoasSet = 0.0f;
		int mediaHospedesSet = 0;
		int mediaNoitesSet = 0;
		double mediaDiariaSet = 0.0f;
		double mediaGastoExtraSet = 0.0f;
		double mediaGastoTotalSet = 0.0f;
		int mediaOcupacaoSet = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Setembro")) {
				mediaPessoasSet = mediaPessoasSet + 1;
				mediaHospedesSet += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesSet += hospedagem.getQtd_noites();
				mediaDiariaSet += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraSet += hospedagem.getGasto_extra();
				mediaOcupacaoSet += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasSet = mediaPessoasSet / 31;
		mediaDiariaSet = mediaDiariaSet / 31;
		mediaGastoExtraSet = mediaGastoExtraSet / 31;
		int strPessoasSet = (int) mediaPessoasSet;
		String strDiarioSet = formato.format(mediaDiariaSet);
		String strExtraSet = formato.format(mediaGastoExtraSet);
		mediaGastoTotalSet = mediaDiariaSet + mediaGastoExtraSet;
		String strGastoTotalSet = formato.format(mediaGastoTotalSet);

		modelo.addRow(new Object[] { "Setembro", strPessoasSet, mediaHospedesSet / 31, mediaNoitesSet / 31,
				strDiarioSet, strExtraSet, strGastoTotalSet, mediaOcupacaoSet / 31 });

		double mediaPessoasOut = 0.0f;
		int mediaHospedesOut = 0;
		int mediaNoitesOut = 0;
		double mediaDiariaOut = 0.0f;
		double mediaGastoExtraOut = 0.0f;
		double mediaGastoTotalOut = 0.0f;
		int mediaOcupacaoOut = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Outubro")) {
				mediaPessoasOut = mediaPessoasOut + 1;
				mediaHospedesOut += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesOut += hospedagem.getQtd_noites();
				mediaDiariaOut += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraOut += hospedagem.getGasto_extra();
				mediaOcupacaoOut += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasOut = mediaPessoasOut / 31;
		mediaDiariaOut = mediaDiariaOut / 31;
		mediaGastoExtraOut = mediaGastoExtraOut / 31;
		int strPessoasOut = (int) mediaPessoasOut;
		String strDiarioOut = formato.format(mediaDiariaOut);
		String strExtraOut = formato.format(mediaGastoExtraOut);
		mediaGastoTotalOut = mediaDiariaOut + mediaGastoExtraOut;
		String strGastoTotalOut = formato.format(mediaGastoTotalOut);

		modelo.addRow(new Object[] { "Outubro", strPessoasOut, mediaHospedesOut / 31, mediaNoitesOut / 31, strDiarioOut,
				strExtraOut, strGastoTotalOut, mediaOcupacaoOut / 31 });
		
		double mediaPessoasNov = 0.0f;
		int mediaHospedesNov = 0;
		int mediaNoitesNov = 0;
		double mediaDiariaNov = 0.0f;
		double mediaGastoExtraNov = 0.0f;
		double mediaGastoTotalNov = 0.0f;
		int mediaOcupacaoNov = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Novembro")) {
				mediaPessoasOut = mediaPessoasOut + 1;
				mediaHospedesNov += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesNov += hospedagem.getQtd_noites();
				mediaDiariaNov += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraNov += hospedagem.getGasto_extra();
				mediaOcupacaoNov += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasOut = mediaPessoasOut / 31;
		mediaDiariaNov = mediaDiariaNov / 31;
		mediaGastoExtraNov = mediaGastoExtraNov / 31;
		int strPessoasNov = (int) mediaPessoasOut;
		String strDiarioNov = formato.format(mediaDiariaNov);
		String strExtraNov = formato.format(mediaGastoExtraNov);
		mediaGastoTotalNov = mediaDiariaNov + mediaGastoExtraNov;
		String strGastoTotalNov = formato.format(mediaGastoTotalNov);

		modelo.addRow(new Object[] { "Novembro", strPessoasNov, mediaHospedesNov / 31, mediaNoitesNov / 31, strDiarioNov,
				strExtraNov, strGastoTotalNov, mediaOcupacaoNov / 31 });

		
		double mediaPessoasDez = 0.0f;
		int mediaHospedesDez = 0;
		int mediaNoitesDez = 0;
		double mediaDiariaDez = 0.0f;
		double mediaGastoExtraDez = 0.0f;
		double mediaGastoTotalDez = 0.0f;
		int mediaOcupacaoDez = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

			if (hospedagem.getMes_checkout().equals("Dezembro")) {
				mediaPessoasOut = mediaPessoasOut + 1;
				mediaHospedesDez += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaNoitesDez += hospedagem.getQtd_noites();
				mediaDiariaDez += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaGastoExtraDez += hospedagem.getGasto_extra();
				mediaOcupacaoDez += hospedagem.getQtd_hospede();

			}
		}

		mediaPessoasOut = mediaPessoasOut / 31;
		mediaDiariaDez = mediaDiariaDez / 31;
		mediaGastoExtraDez = mediaGastoExtraDez / 31;
		int strPessoasDez = (int) mediaPessoasOut;
		String strDiarioDez = formato.format(mediaDiariaDez);
		String strExtraDez = formato.format(mediaGastoExtraDez);
		mediaGastoTotalDez = mediaDiariaDez + mediaGastoExtraDez;
		String strGastoTotalDez = formato.format(mediaGastoTotalDez);

		modelo.addRow(new Object[] { "Dezembro", strPessoasDez, mediaHospedesDez / 31, mediaNoitesDez / 31, strDiarioDez,
				strExtraDez, strGastoTotalDez, mediaOcupacaoDez / 31 });
		
	}
	
	public void carregaDadosAnoTabela(){
		
		HospedagemDAO hospedagemDao = HospedagemDAO.getInstancia();
		List<Hospedagem> hospedagemlist = hospedagemDao.searchAll(Hospedagem.class);

		double mediaAnoPessoas = 0.0f;
		int mediaAnoHospedes = 0;
		int mediaAnoNoites = 0;
		double mediaAnoDiaria = 0.0f;
		double mediaAnoGastoExtra = 0.0f;
		double mediaAnoGastoTotal = 0.0f;
		int mediaAnoOcupacaoAno = 0;

		for (Hospedagem hospedagem : hospedagemlist) {

				mediaAnoPessoas = mediaAnoPessoas + 1;
				mediaAnoHospedes += hospedagem.getQtd_hospede() * hospedagem.getQtd_noites();
				mediaAnoNoites += hospedagem.getQtd_noites();
				mediaAnoDiaria += hospedagem.getValor_uh() * hospedagem.getQtd_noites();
				mediaAnoGastoExtra += hospedagem.getGasto_extra();
				mediaAnoOcupacaoAno += hospedagem.getQtd_hospede();

			}
		
		fieldAno.setText("2017");
		
		mediaAnoPessoas = mediaAnoPessoas / 12;
		int strAnoPessoas = (int) mediaAnoPessoas;
		String strAnoPessoa = String.valueOf(strAnoPessoas);
		fieldPessoas.setText(strAnoPessoa);
		
		mediaAnoHospedes = mediaAnoHospedes / 12;
		String strAnoHospede = String.valueOf(mediaAnoHospedes);
		fieldReservas.setText(strAnoHospede);
		
		mediaAnoNoites = mediaAnoNoites / 12;
		String strAnoNoites = String.valueOf(mediaAnoNoites);
		fieldNoites.setText(strAnoNoites);
		
		mediaAnoDiaria = mediaAnoDiaria / 12;
		String strDiario = formato.format(mediaAnoDiaria);
		String strAnoDiaria = String.valueOf(strDiario);
		fieldDiaria.setText(strAnoDiaria);
		
		mediaAnoGastoExtra = mediaAnoDiaria / 12;
		String strExtra = formato.format(mediaAnoGastoExtra);
		String strAnoGastoExtra = String.valueOf(strExtra);
		fieldGastoExtra.setText(strAnoGastoExtra);
		
		mediaAnoGastoTotal = mediaAnoDiaria + mediaAnoGastoExtra;
		String strGastoTotal = formato.format(mediaAnoGastoTotal);
		String strAnoGastoTotal = String.valueOf(strGastoTotal);
		fieldGastoTotal.setText(strAnoGastoTotal);
		
		mediaAnoOcupacaoAno = mediaAnoOcupacaoAno / 12;
		String strAnoOcupacao = String.valueOf(mediaAnoOcupacaoAno);
		fieldOcupacao.setText(strAnoOcupacao);
			
	}

}
