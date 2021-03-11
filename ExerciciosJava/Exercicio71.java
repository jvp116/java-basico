package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor inteiro e escrever a tabuada de 1 a 10 do valor
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio71 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int valor;
		String msg = "";

		// repete até a informação ser 1 a 10
		do {
			// recebendo informação do usuário
			valor = Integer
					.parseInt(JOptionPane.showInputDialog("Iremos calcular a tabuada de um valor\nInforme o valor"));
		} while ((valor <= 0) || (valor > 10));

		// inicializando a variável 'i', condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			// incrementando a variável msg a ela mesma
			msg += valor + " x " + i + " = " + (valor * i) + "\n";
		}

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Tabuada do " + valor + "\n" + msg);
	}

}