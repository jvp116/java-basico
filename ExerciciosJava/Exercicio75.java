package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número de alunos existentes em uma turma e, após isto,
 * ler as notas destes alunos, calcular e escrever a média aritmética dessas
 * notas lidas.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int alunos = 0;
		double notas, media = 0, soma = 0;

		// recebendo informação do usuário
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos da turma"));

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= alunos; i++) {
			notas = Double.parseDouble(JOptionPane.showInputDialog("Informe " + alunos + " notas\n" + i + "º aluno"));
			soma += notas;
			// calculando a média das notas dos alunos
			media = soma / alunos;
		}

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "A média aritmética das notas lidas é: \n" + media);
	}

}