package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e escrever o maior deles
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio41 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		double v1, v2;

		// recebendo informação do usuário
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando qual é maior
		if (v1 > v2) {
			JOptionPane.showMessageDialog(null, v1 + " é maior");
		} else if (v2 > v1) {
			JOptionPane.showMessageDialog(null, v2 + " é maior");
		}

	}

}
