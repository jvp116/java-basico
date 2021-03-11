package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 números e armazenar em um vetor.O programa deve escrever
 * esses 20 números lidos na ordem inversa.
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class Exercicio93 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a variável msg para receber a saída de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		int num[] = new int[20];

		// inicializando a variável, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da posição " + (i + 1)));
		}

		// inicializando a variável, condicionando e decrementando
		for (int j = num.length - 1; j >= 0; j--) {
			msg += num[j] + "\n";
		}

		// Saída de dados (resultado)
		JOptionPane.showMessageDialog(null, "Ordem inversa\n" + msg);
	}

}
