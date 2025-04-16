package br.dev.nunes.tabuada;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.dev.nunes.tabuada.gui.TelaTabuada;
import br.dev.nunes.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args ) {
		
		TelaTabuada tela = new TelaTabuada();
		tela.criarTela("Tabuada DS1MA");
		
/*		//Brincando com vetores
		double[] notas = new double [4];
		notas[0] = 7.0;
		notas[1] = 8.3;
		notas[2] = 8.1;
		notas[3] = 6.9;
		notas[3] = 6.9;
		notas[3] = 6.9;
		
		System.out.println(notas[2]);
		System.out.println(notas.length);
		double media = (notas[0] + notas [1] + notas [2] + notas [3]) / notas.length;
		//System.out.println((notas[0] + notas[3] + notas[1] + notas [2])/4);
		
		
		int i = 0;
		double totalNotas = 0.0;
		while (i < notas.length) {
			totalNotas += notas[i];
			i++;
		}
		
		media = totalNotas / notas.length;
		System.out.println("A média do aluno é " + media);
		
		System.out.println();
		System.out.println();
		
		String[] cidades = new String [6];
		cidades[0] = "Osasco";
		cidades[1] = "Guarulhos";
		cidades[2] = "Itaquera";
		cidades[3] = "Fortaleza";
		cidades[4] = "Alphaville";
		cidades[5] = "Jandira";
		
		i =0;
		while (i < cidades.length) {
			System.out.println(i + " - " + cidades[i]);
			i++;
		}
		
		String[] equipamentos = {
				"Mouse",
				"Teclado",
				"Monitor",
				"Impressora",
				"Scanner",
				"Access Point",
				"Roteador",
		};
		
		System.out.println();
		System.out.println();
		
		i =0;
		while (i <equipamentos.length) {
			System.out.println(i + 1 + " - " + equipamentos[i]);
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		double precos[] = {12.5, 28.99, 65.78, 71.99};
		
/*
 * 		JTextField campos[];
 */
		
	}
}
