package exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e armazenar no vetor. Ordena os números no vetor
 * em ordem crescente. Escreve o vetor ordenado.
 * 
 * @author João Victor
 * @since 12/02/2021
 */
public class Exercicio95 {

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

		// utilidade do java para ordenar em ordem crescente elementos de um array
		Arrays.sort(num);

		// inicializando a variável, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			msg += num[i] + "\n";
		}

		// Saída de dados (resultado)
		JOptionPane.showMessageDialog(null, "Ordem Crescente do Array\n" + msg);
	}

}