package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa em que o usuário forneça a quantidade de camisetas pequenas, médias
 * e grandes referentes a uma venda, e a máquina informe quanto será o valor
 * arrecadado.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio27 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int p, m, g, valor;

		// recebendo dados do usuário e armazenando nas variáveis
		p = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de camisetas pequenas"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de camisetas médias"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Informe a a quantidade de camisetas grandes"));

		// calculando o valor arrecadado
		valor = (p * 10) + (m * 12) + (g * 15);

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Valor arrecadado: R$ " + valor);
	}

}
