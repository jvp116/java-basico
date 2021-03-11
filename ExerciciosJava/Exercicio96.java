package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e armazenar no vetor. Ordena os números no vetor
 * em ordem crescente. Exibe o vetor ordenado. Lê mais um número qualquer e
 * insere esse novo número na posição correta mantendo a ordem crescente do
 * vetor.
 * 
 * @author João Victor
 * @since 12/02/2021
 */
public class Exercicio96 {

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

		// lista de objetos inteiros
		List<Integer> novo = new ArrayList<Integer>(10);

		// adicionando a essa lista os elementos do vetor num[]
		for (int i = 0; i < num.length; i++) {
			novo.add(num[i]);
		}
		// adicionando um novo número a lista
		novo.add(Integer.parseInt(JOptionPane.showInputDialog("Informe um número adicional")));

		// vetor integer recebendo a conversão da lista de objetos para um vetor/array
		Integer[] vetor = (Integer[]) novo.toArray(new Integer[0]);

		// utilidade do java para ordenar em ordem crescente elementos de um array
		Arrays.sort(vetor);

		// string declarada para receber os elementos do vetor[]
		String novaMsg = "";

		// inicializando a variável, condicionando e incrementando
		for (int i = 0; i < novo.size(); i++) {
			novaMsg += vetor[i] + "\n";
		}

		// Saída de dados (resultado)
		JOptionPane.showMessageDialog(null, "Ordem Crescente do NOVO Array\n" + novaMsg);
	}

}