package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula a exponenciação de dois valores e exibir na tela o
 * resultado
 *
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio13 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double n1, n2, res;

		// atribuindo valores nas variáves
		n1 = 2;
		n2 = 3;

		// calculando a EXPONENCIAÇÃO atráves da função MATH.POW
		res = Math.pow(n1, n2);

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "EXPONENCIAÇÃO:  " + res);
	}

}