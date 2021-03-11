package exercicios;

import javax.swing.JOptionPane;

/**
 * Progrma para exibir idade, altura e peso
 *
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio07 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int idade;
		double altura, peso;

		// recebendo dados do usuário e armazenando nas variáves
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));

		// mostrando na tela pro usuário
		System.out.println("Idade: " + idade + "\n" + "Altura: " + altura + "\n" + "Peso: " + peso);
	}

}
