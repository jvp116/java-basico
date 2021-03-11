package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores, calcular e escrever a média aritmética desses
 * valores lidos.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio74 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int valor = 0;
		double media = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "º valor"));
			media += valor;
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Média aritmética dos 10 valores é\n" + (media / 10));
	}

}