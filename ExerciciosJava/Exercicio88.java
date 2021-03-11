package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um nome específicio no vetor
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class Exercicio88 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando um vetor String
		String nomes[];

		// inicializar e definir o tamanho do vetor
		nomes = new String[10];

		// recebendo do usuario os nomes e armazenando em um vetor
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe um nome");
		}

		// recebendo do usuario um nome qualquer
		String busca = JOptionPane.showInputDialog("Informe o nome a ser procurado");

		// variavel auxiliar para contar as vezes que achou o nome escolhido pelo
		// usuario
		boolean achou = false;

		// varrendo o vetor para verificar se o nome informado pelo usuario existe
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(busca)) {
				achou = true;
			}
		}

		// exibindo o resultado da busca
		if (achou) {
			System.out.println("ACHEI");
		} else {
			System.out.println("NÃO ACHEI");
		}

	}

}
