package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade e a seguir ler a quantidade em números
 * informados. Depois de ler todos os números o programa apresenta na tela o
 * maior dos números lidos e a média dos números lidos.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio82 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int quantidade, num = 0, maior = 0, soma = 0;
		double media = 0;

		// recebendo informação do usuário
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de números que deseja informar?"));

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= quantidade; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "º número"));
			soma += num;

			if (num > maior) {
				maior = num;
			}
		}
		// calculando a média
		media = soma / quantidade;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Maior dos números: " + maior + "\n" + "Média dos números: " + media);
	}

}