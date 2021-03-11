package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números. Todos os números lidos com valor inferior a 40
 * serão somados.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio77 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int num = 0, soma = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "º valor"));
			if (num < 40) {
				soma += num;
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Soma dos valores menores que 40: " + soma);
	}

}