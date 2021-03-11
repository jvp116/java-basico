package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o
 * valor correspondente em graus Celsius (baseado na fórmula);
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio23 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int fahren, celsius;

		// recebendo dados do usuário e armazenando nas variáveis
		fahren = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit"));

		// calculando a área do retângulo
		celsius = ((fahren - 32) / 9) * 5;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + celsius + " °C");
	}

}
