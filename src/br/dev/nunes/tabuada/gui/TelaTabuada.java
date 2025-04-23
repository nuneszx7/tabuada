package br.dev.nunes.tabuada.gui;


import javax.swing.*;

import br.dev.nunes.tabuada.model.Tabuada;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TelaTabuada {
	public void criarTela(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// Criar o JFrame
		
		
		JFrame frame = new JFrame("Tabuada");
		frame.setSize(300, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

				
		// Criar o painel de conteúdo
		Container container = frame.getContentPane();
		container.setLayout(null);

				
		// Criar os componentes
		JLabel labelMultiplicando = new JLabel("Multiplicando:");
		JLabel labelMinMultiplicador = new JLabel("Mínimo multiplicador:");	
		JLabel labelMaxMultiplicador = new JLabel("Máximo multiplicador:");
		JTextField txtMultiplicando = new JTextField();
		JTextField txtMinMultiplicador = new JTextField();
		JTextField txtMaxMultiplicador = new JTextField();
		JButton buttonCalcular = new JButton("Calcular");
		JButton buttonLimpar = new JButton("Limpar");

				
		// Definir posições e tamanhos dos componentes
		labelMultiplicando.setBounds(20, 20, 150, 30);
		txtMultiplicando.setBounds(170, 20, 100, 30);
		labelMinMultiplicador.setBounds(20, 60, 150, 30);
		txtMinMultiplicador.setBounds(170, 60, 100, 30);
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);
		txtMaxMultiplicador.setBounds(170, 100, 100, 30);
		buttonCalcular.setBounds(20, 140, 100, 30);
		buttonLimpar.setBounds(130, 140, 100, 30);

			
		// Criar o JList para exibir a tabuada
		JList<String> listTabuada = new JList<>();

				
		// Criar o JScrollPane para adicionar ao list
		JScrollPane scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 190, 210, 350);

				
		// Adicionando os componentes no painel de conteúdo do JFrame
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(txtMultiplicando);
		container.add(txtMinMultiplicador);
		container.add(txtMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		container.add(scrollTabuada);

		
		// Adicionar ouvintes nos botoes
		buttonCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
						
				
			//Recuperei os valores digitados pelo usuario
			String multiplicando = txtMultiplicando.getText();
			String min = txtMinMultiplicador.getText();
			String max = txtMaxMultiplicador.getText();
			
			
			//Convertendo string para double
			double multiplicandoDouble = Double.parseDouble(multiplicando);
			double minDouble = Double.parseDouble(min);
			double maxDouble = Double.parseDouble(max);
				
			
			Tabuada tabuada = new Tabuada();
			tabuada.setMultiplicando(multiplicandoDouble);
			tabuada.setMinimoMultiplicador(minDouble);
			tabuada.setMaximoMultiplicador(maxDouble);
			tabuada.mostrarTabuada();
			
			String[] tabuadaResult = tabuada.mostrarTabuada();

			listTabuada.setListData(tabuadaResult);
			
			}
					
		});

		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtMultiplicando.setText("");
				txtMaxMultiplicador.setText("");
				txtMinMultiplicador.setText("");
				listTabuada.setListData(new String[0]);
				txtMultiplicando.requestFocus();
				
				
				
			}
		});
		
		

		// Tornar a tela visível
		frame.setVisible(true);
				
				
	
	}

	

	
	
	}
		

