package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 10 números. Ler mais um número qualquer,
 * calcular e escrever quantas vezes esse número aparece no vetor.
 * 
 * @author João Victor
 * @since 12/02/2021
 */
public class Exercicio99 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a variável msg para receber a saída de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		int num[] = new int[10];

		// inicializando a variável, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número"));
		}

		// variável que recebe um número qualquer
		int other = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número"));

		// variável contador
		int contador = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			if (num[i] == other) {
				contador++;
			}
		}

		// atribuindo valores e concatenando à variável msg
		msg += contador;

		// Saída de dados (resultado)
		JOptionPane.showMessageDialog(null, "O número " + other + " aparece " + msg + " vezes no vetor");
	}

}