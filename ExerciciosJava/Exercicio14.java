package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula o módulo entre dois valores e exibir na tela o resultado
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio14 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double n1, n2, res;

		// atribuindo valores as variáves
		n1 = 4;
		n2 = 3;
		// calculando o módulo
		res = n1 % n2;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "MÓDULO> " + n1 + " % " + n2 + " = " + res);
	}

}