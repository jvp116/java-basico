package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor N qualquer (que será o tamanho dos vetores). Após,
 * ler dois vetores A e B, armazenar em um terceiro vetor SOMA a soma dos
 * elementos do vetor A com os do vetor B e escrever o vetor Soma.
 * 
 * @author João Victor
 * @since 12/02/2021
 */
public class Exercicio94 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a variável msg para receber a saída de dados
		String msg = "";

		// declarando e inicializando a variável N - indica o tamanho do vetor
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho dos vetores"));

		// declarando, inicializando e definindo tamanho do vetor
		int A[] = new int[n];
		int B[] = new int[n];

		// vetor que receberá a soma dos elementos de A + B
		int SOMA[] = new int[n];

		// inicializando a variável, condicionando e incrementando
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor de A"));
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor de B"));
		}

		// Loop FOR: inicializando a variável; condicionando; incrementando
		for (int i = 0; i < SOMA.length; i++) {
			// somando os elementos de A e B
			SOMA[i] = A[i] + B[i];
			// atribuindo valores e concatenando à variável msg
			msg += "SOMA[" + i + "] = " + SOMA[i] + "\n";
		}

		// Saída de dados (resultado)
		JOptionPane.showMessageDialog(null, msg);
	}

}
