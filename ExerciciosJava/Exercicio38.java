package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler nº de maçãs e calcular o custo total da compra
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int macas;
		double custo;

		// recebendo informação do usuário
		macas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de maçãs compradas"));

		// verificando se nº de maçãs é 0 ou negativo
		if ((macas < 0) || (Math.floor(macas) != macas)) { // mostra mensagem na tela
			JOptionPane.showMessageDialog(null, "Informe uma quantidade válida");
		} else if (macas < 12) { // verificando se é menor que 12
			// calculando o custo das maçãs e mostrando na tela
			custo = macas * 1.3;
			JOptionPane.showMessageDialog(null, "Custo total: R$" + custo);
		} else {
			// calculando o custo das maçãs e mostrando na tela
			custo = macas * 1;
			JOptionPane.showMessageDialog(null, "Custo total: R$" + custo);
		}

	}

}
