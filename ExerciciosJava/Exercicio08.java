package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir salário e vale-refeição
 *
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio08 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double salario, vale;

		// recebendo dados do usuário e armazenando nas variáves
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
		vale = Double.parseDouble(JOptionPane.showInputDialog("Informe seu vale-refeição"));

		// mostrando na tela pro usuário
		System.out.println("Salário: R$ " + salario + "\n" + "Vale-refeção: R$" + vale);
	}

}