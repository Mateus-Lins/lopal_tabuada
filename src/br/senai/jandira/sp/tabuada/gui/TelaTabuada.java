package br.senai.jandira.sp.tabuada.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {

	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		//definir o tamanho da tela
		//através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 700);
		
		tela.setSize(tamanho);
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		//criar um JLabel
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do multiplicando:");
		labelMultiplicando.setBounds(50, 50, 150, 30);
		
		//criar um JTextField
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(202, 50, 80, 30);
		
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		
		
		
		tela.setVisible(true);
		
	}
	
}
