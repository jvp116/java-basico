package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e ao final da leitura escrever a soma total dos
 * 10 números lidos.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio76 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int num = 0, soma = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "º valor"));
			soma += num;
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Soma total dos 10 nº = " + soma);
	}

}