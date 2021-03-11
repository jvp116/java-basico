package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que imprime a tabuada (de 1 a 10) para os números de 1 a 10.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio85 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variável msg para mostrar na tela
		String msg = "";

		// inicializando a variável 'i', condicionando e incrementando
		for (int i = 1; i <= 10; i++) {
			msg += "\n";
			for (int j = 1; j <= 10; j++) {
				msg += j + " x " + i + " = " + (j * i) + "\n";
			}
		}

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}