package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que lê três notas de um aluno, calcula e escreve a média final deste
 * aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio24 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double n1, n2, n3, media_final;

		// recebendo dados do usuário e armazenando nas variáveis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));

		// calculando média final do aluno
		media_final = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Média final é: " + media_final);
	}

}
