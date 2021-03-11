package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma temperatura Celsius e imprimi-la em Fahrenheit
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio30 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int fahren, celsius;

		// recebendo dados do usuário e armazenando na variável
		celsius = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura em Celsius"));

		// calculando a área do retângulo
		fahren = celsius * 9 / 5 + 32;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + fahren + " °F");
	}

}
