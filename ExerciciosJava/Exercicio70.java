package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir a tabuada do 8 (1 a 10).
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio70 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variável msg para mostrar na tela
		String msg = "";

		// inicializando a variável 'i', condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			msg += "8 x " + i + " = " + (8 * i) + "\n";
		}

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Tabuada do 8\n" + msg);
	}

}