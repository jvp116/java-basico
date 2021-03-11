package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir sua divisão
 *
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio12 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double n1, n2, res;

		// recebendo dados do usuário e armazenando nas variáves
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));

		// calculando a divisão
		res = n1 / n2;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "DIVISÃO:  " + n1 + " / " + n2 + " = " + res);
	}

}