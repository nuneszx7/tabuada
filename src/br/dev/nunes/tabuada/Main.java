package br.dev.nunes.tabuada;

import javax.swing.JFrame;

import br.dev.nunes.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		
		
//		JFrame tela = new JFrame();
//		tela.setTitle("DS1MA");
//		tela.setSize(500, 600);
//		tela.setVisible(true);
//		
//		System.out.println(tela.getSize().height);
//		System.out.println(tela.getTitle());
			
		Tabuada tabuada = new Tabuada();
		tabuada.setMultiplicando(8);
		tabuada.setMinimoMultiplicador(14);
		tabuada.setMaximoMultiplicador(20);
		tabuada.mostrarTabuada();
		
		Tabuada tabuada2 = new Tabuada();
		tabuada2.setMultiplicando(457);
		tabuada2.setMinimoMultiplicador(56);
		tabuada2.setMaximoMultiplicador(54);
		tabuada2.mostrarTabuada();
		
		System.out.println(tabuada.getMultiplicando());
		double mult1 = tabuada.getMultiplicando();
		
		if (mult1 % 2 == 0) {
			System.out.println("O multiplicando " + mult1 + " é PAR!");
		}else {
			System.out.println("O multiplicando" + mult1 + "é IMPAR!");
		}
	}
}
