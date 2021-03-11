package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores, calcular e imprimir a média. somente valores
 * entre 0 e 10 para leitura
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int n1, n2;
		double media;

		// Só devem ser aceitos valores válidos durante a leitura (0 a 10)
		do {
			// recebendo informação do usuário
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota da 1ª avaliação"));

		} while (((n1 < 0) || (n1 > 10)));

		do {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota da 2ª avaliação"));

		} while (((n2 < 0) || (n2 > 10)));

		// calculando a média do aluno
		media = (n1 + n2) / 2;

		// mostrando a média das notas na tela
		JOptionPane.showMessageDialog(null, "Média: " + media);
	}

}