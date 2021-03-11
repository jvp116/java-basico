package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para que lê notas de uma turma de 20 alunos. Calcula a média da
 * turma e conta quantos alunos obtiveram nota acima desta média calculada.
 * Escreve a média da turma e o resultado da contagem.
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class Exercicio89 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variável que mostrará a saída de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		double alunos[] = new double[20];

		// variável auxiliar que recebe a soma das notas
		double soma = 0;

		// variável que recebe a média das notas
		double media = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do aluno " + (i + 1)));

			// soma das notas armazenadas nos elementos do vetor
			soma += alunos[i];
		}
		// calculando a média das notas da turma
		media = soma / alunos.length;

		// variável auxiliar, contador de quantas notas estão acima da média
		int contador = 0;

		// varrendo o array para verificar quais notas estão acima da média calculada
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] > media) {
				contador++;
			}
		}
		// definindo duas casas decimais para o resultado
		DecimalFormat f = new DecimalFormat("#.##");

		// atribuindo valores e concatenando à variável msg
		msg += "A média da turma é: " + f.format(media);
		msg += "\nQuantidade de alunos que obtiveram nota acima da média: " + f.format(contador);

		// Saída dos resultados
		JOptionPane.showMessageDialog(null, msg);
	}

}
