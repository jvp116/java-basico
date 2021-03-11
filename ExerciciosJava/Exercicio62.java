package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 notas obtidas por um aluno nas 3 verificações e a média
 * dos exercícios que fazem parte da avaliação. Calcular a média de
 * aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de
 * acordo com a tabela de conceitos
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio62 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		double n1, n2, n3, mediaExs, mediaAproveita;
		String msg = "";
		// recebendo o que o usuário digitou
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
		mediaExs = Double.parseDouble(JOptionPane.showInputDialog("Informe a média dos exercícios"));

		// calcula a média de aproveitamento, usando a fórmula
		mediaAproveita = (n1 + (n2 * 2) + (n3 * 3) + mediaExs) / 7;
		msg = "Sua média de aproveitamento é: " + mediaAproveita;

		// Conceito A: >= 9
		// Conceito B: >= 7.5 e < 9
		// Conceito C: >= 6 e < 7.5
		// Conceito D: < 6
		if (mediaAproveita >= 9) {
			msg += "\n\nconceito: A";
		} else if ((mediaAproveita >= 7.5) && (mediaAproveita < 9)) {
			msg += "\n\nconceito: B";
		} else if ((mediaAproveita >= 6) && (mediaAproveita < 7.5)) {
			msg += "\n\nconceito: C";
		} else if (mediaAproveita < 6) {
			msg += "\n\nconceito: D";
		}
		// mostra o conceito do aluno de acordo com a tabela de conceitos
		JOptionPane.showMessageDialog(null, msg);

	}

}