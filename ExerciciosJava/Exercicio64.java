package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exebir o resultado da divisão entre eles
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio64 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		double dividendo, divisor;

		// recebendo o primeiro valor do usuario
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));

		// inicializando a variavel divisor
		divisor = 0;

		// recebendo o segundo valor do usuario - tem que ser diferente de zero
		while (divisor == 0) {
			divisor = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		}

		// exibindo o resultado da divisão para o usuario
		JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (dividendo / divisor));

	}

}
