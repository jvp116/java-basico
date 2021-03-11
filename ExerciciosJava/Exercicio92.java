package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor A de 10 números. Ler mais um número e guardar em
 * uma variável X. Armazenar em um vetor M o resultado de cada elemento de A
 * multiplicado pelo valor X. Imprimir o vetor M.
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class Exercicio92 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a variável msg para receber a saída de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor A e M
		int A[] = new int[10]; // vetor que recebe os valores informados
		int M[] = new int[10]; // recebe a multiplicação dos valores de A por X

		// Loop FOR: inicializando a variável; condicionando; incrementando
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "º número"));
		}

		// variável X que recebe o valor que irá multiplicar os elementos de A
		int X = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para multiplicar"));

		// Loop FOR: inicializando a variável; condicionando; incrementando
		for (int i = 0; i < M.length; i++) {
			M[i] = X * A[i];
			// atribuindo valores e concatenando à variável msg
			msg += "M[" + i + "] = " + M[i] + "\n";
		}

		// Saída dos dados (resultado)
		JOptionPane.showMessageDialog(null, "Vetor M\n\n" + msg);
	}

}
