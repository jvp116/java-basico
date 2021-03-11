package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e no final, escrever o maior e o menor.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio81 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int valor = 0, menor = Integer.MAX_VALUE, maior = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "º valor"));

			if (valor < menor) {
				menor = valor;
			}

			if (valor > maior) {
				maior = valor;
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Menor valor informado: " + menor + "\nMaior valor informado: " + maior);
	}

}
