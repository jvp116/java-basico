package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o código e o preço de 5 produtos, calcular e escrever: O
 * maior preço lido A média aritmética dos preços dos produtos
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio83 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int soma = 0;
		double maior = 0, preco, media = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= 5; i++) {
			Integer.parseInt(JOptionPane.showInputDialog("Insira o CÓDIGO do produto " + i));
			preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o PREÇO do produto " + i));

			soma += preco;

			if (preco > maior) {
				maior = preco;
			}
		}
		// calculando a média
		media = soma / 5;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Maior preço: " + maior + "\n" + "Média dos preços: " + media);
	}

}
