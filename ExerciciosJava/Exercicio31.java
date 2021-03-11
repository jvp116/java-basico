package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula o gasto total da granja para marcar todos os frangos
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio31 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double anelChip, anelAlimento, qtdFrango;

		// recebendo dados do usuário e armazenando na variável
		qtdFrango = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade total de frangos"));

		// atribuindo valores as variáveis
		anelChip = qtdFrango * 4;
		anelAlimento = qtdFrango * 7;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null,
				"Gasto total para marcar todos os frangos na granja é: " + (anelChip + anelAlimento));
	}

}
