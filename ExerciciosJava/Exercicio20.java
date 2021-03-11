package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter uma quantidade de dólar para real;
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio20 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double dolar, real;

		// recebendo dados do usuário e armazenando nas variáveis
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em Dólar US$"));

		// calculando e convertendo para real
		real = dolar * 6.61;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, dolar + " dolar equivale a " + real + " reais");
	}

}