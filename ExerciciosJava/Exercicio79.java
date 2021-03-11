package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a média aritmética dos números inteiros
 * entre 15 (inclusive) e 100 (inclusive).
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio79 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int soma = 0, media;

		// inicializando a variável, condicionando e incrementando
		for (int i = 15; i < 101; i++) {
			soma += i;
		}
		// calculando a média
		media = soma / 85;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null,
				"média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive)\n" + media);
	}

}