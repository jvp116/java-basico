package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 20 números. Deverá ser lido mais um número
 * qualquer e verificar se esse número existe no vetor ou não. Se existir, o
 * programa deve gerar um novo vetor sem esse número.
 * 
 * @author João Victor
 * @since 12/02/2021
 */
public class Exercicio97 {

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
		int adNum = 0;

		// adicionando um novo número a lista
		adNum = Integer.parseInt(JOptionPane.showInputDialog("Informe um número qualquer"));

		// variável booleana
		boolean remove = false;

		// adicionando a essa lista os elementos do vetor num[]
		// verificar se esse número já existe no array, se sim, removê-lo
		for (int i = 0; i < num.length; i++) {
			novo.add(num[i]);
			if (adNum == num[i]) {
				novo.remove(num[i - 1]);
				remove = true;
			}
		}

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

		// verifica e relamente foi removido
		if (remove == true) {
			// Saída de dados (resultado)
			JOptionPane.showMessageDialog(null, "Ordem Crescente do NOVO Vetor\n" + novaMsg);
		} else {
			JOptionPane.showMessageDialog(null, "Ordem Crescente do Vetor\n" + msg);
		}
	}

}