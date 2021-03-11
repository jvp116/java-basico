package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores V1 e V2 de 15 números cada. Calcular e
 * escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas
 * mesmas posições.
 * 
 * @author João Victor
 * @since 12/02/2021
 */
public class Exercicio98 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a variável msg para receber a saída de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor v1 e v2
		int v1[] = new int[15];
		int v2[] = new int[15];

		// Loop FOR: inicializando a variável; condicionando; incrementando
		for (int i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "º número do vetor 1"));
		}
		for (int i = 0; i < v2.length; i++) {
			v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "º número do vetor 2"));
		}

		// variável auxiliar para quantidade de vezes que V1 e V2 possuem os mesmos
		// números
		int contador = 0;
		for (int i = 0; i < v2.length; i++) {
			if (v1[i] == v2[i]) {
				contador++;
			}
		}
		// atribuindo valores e concatenando à variável msg
		msg += contador;

		// Saída de dados (resultado)
		JOptionPane.showMessageDialog(null,
				"Quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições\n" + msg);
	}

}
