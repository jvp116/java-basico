package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o valor total da conta e imprimir quanto cada um deve
 * pagar, mas Carlos e André não pagam centavos.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio28 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double carlos, andre, felipe, valor_total, divide;

		// recebendo dados do usuário e armazenando nas variáveis
		valor_total = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da conta"));

		// divide o valor em três
		divide = (int) valor_total / 3;

		// atribuindo o quanto cada um deve pagar
		carlos = divide;
		andre = divide;
		felipe = valor_total - (carlos + andre);

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Carlos pagará: R$ " + carlos + "\n" + "André pagará: R$ " + andre + "\n"
				+ "Felipe pagará: R$ " + felipe);
	}

}
