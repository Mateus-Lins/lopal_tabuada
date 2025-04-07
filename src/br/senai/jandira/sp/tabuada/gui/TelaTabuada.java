package br.senai.jandira.sp.tabuada.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JTextField txtMultiplicando;

	private JLabel labelMenorMultiplicador;
	private JTextField txtMenorMultiplicador;

	private JLabel labelMaiorMultiplicador;
	private JTextField txtMaiorMultiplicador;

	private JButton btnCalcular;
	private JButton btnLimpar;

	private JLabel labelResultado;

	private JScrollPane scrollTabuada;

	private JList listaTabuada;

	public void criarTela() {

		JFrame tela = new JFrame();

		// definir o tamanho da tela
		// através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(335, 700);

		tela.setSize(tamanho);

		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		// criar um JLabel e um JTextField para o multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do multiplicando:");
		labelMultiplicando.setBounds(50, 50, 150, 30);

		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(210, 50, 80, 30);

		// criar um JLabel e um JTextField para o menor multiplicador
		labelMenorMultiplicador = new JLabel();
		labelMenorMultiplicador.setText("menor multiplicador:");
		labelMenorMultiplicador.setBounds(50, 90, 150, 30);

		txtMenorMultiplicador = new JTextField();
		txtMenorMultiplicador.setBounds(210, 90, 80, 30);

		//
		labelMaiorMultiplicador = new JLabel();
		labelMaiorMultiplicador.setText("maior multiplicador:");
		labelMaiorMultiplicador.setBounds(50, 130, 150, 30);

		txtMaiorMultiplicador = new JTextField();
		txtMaiorMultiplicador.setBounds(210, 130, 80, 30);

		btnCalcular = new JButton();
		btnCalcular.setText("calcular");
		btnCalcular.setBounds(50, 170, 115, 30);

		btnLimpar = new JButton();
		btnLimpar.setText("limpar");
		btnLimpar.setBounds(175, 170, 115, 30);

		// label do resultado
		labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(50, 210, 200, 30);

		// criando a lista que exibira a taubuada
		listaTabuada = new JList();

		// criando o painel de rolagem pra lista
		scrollTabuada = new JScrollPane(listaTabuada);
		scrollTabuada.setBounds(50, 250, 240, 400);

		// scrollTabuada.add(listaTabuada);

		// adicionando componentes ao painel de conteudo
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);

		tela.getContentPane().add(labelMenorMultiplicador);
		tela.getContentPane().add(txtMenorMultiplicador);

		tela.getContentPane().add(labelMaiorMultiplicador);
		tela.getContentPane().add(txtMaiorMultiplicador);

		tela.getContentPane().add(btnCalcular);

		tela.getContentPane().add(btnLimpar);

		tela.getContentPane().add(labelResultado);

		tela.getContentPane().add(scrollTabuada);

		tela.setVisible(true);

	}

}
