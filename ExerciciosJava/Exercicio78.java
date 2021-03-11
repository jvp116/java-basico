package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores, calcular e escrever a soma dos inteiros
 * existentes entre os 2 valores lidos (incluindo os valores lidos na soma).
 * Considerando que o segundo valor lido será sempre maior que o primeiro valor
 * lido.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio78 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int n1 = 0, n2 = 0, soma = 0;

		// recebendo informação do usuário
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// inicializando a variável, condicionando e incrementando
		for (int i = n1; i <= n2; i++) {
			// calculando a soma
			soma += i;
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null,
				"A soma dos inteiros existentes entre os 2 valores informados,\ninclusive os informados é: " + soma);
	}

}