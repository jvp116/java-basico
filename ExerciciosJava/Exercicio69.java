package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Ler um valor N e imprimir todos os valores inteiros entre 1
 * (inclusive) e N (inclusive).
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio69 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int n = 0;
		String msg = "";

		do {
			// recebendo informação do usuário
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		} while (n < 1);

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i < n + 1; i++) {
			msg += i + "\n";
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}