package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que recebe a entrada das seguintes informações: a) o número total de
 * mercadorias no estoque; b) o valor de cada mercadoria. Ao final exibe o valor
 * total em estoque e a média de valor das mercadorias.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio80 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int qtdMerca;
		double valorMerca = 0, media = 0;

		// recebendo informação do usuário
		qtdMerca = Integer.parseInt(JOptionPane.showInputDialog("Informe o número total de mercadorias no estoque"));

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= qtdMerca; i++) {
			valorMerca += Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto " + i));
		}
		// calculando a média
		media = valorMerca / qtdMerca;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null,
				"Total de mercadorias em estoque: " + qtdMerca + "\nMédia do valor das mercadorias: " + media);
	}

}
