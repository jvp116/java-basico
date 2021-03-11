package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que lê um valor e exibir na tela o seu antecessor
 *
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio15 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int n1, res;

		// recebendo dados do usuário e armazenando na variável
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

		// calculando o antecessor
		res = n1 - 1;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "ANTECESSOR de " + n1 + " é " + res);
	}

}