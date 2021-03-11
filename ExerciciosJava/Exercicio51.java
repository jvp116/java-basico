package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escreve a multiplicação dos menores deles
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int v1, v2, v3, multi = 0;

		// recebendo informação do usuário
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se v1 é menor que v2 e v3
		if (((v1 < v2) && (v2 < v3)) || ((v1 < v3) && (v3 < v2))) {
			if (v2 < v3) { // se v2 é menor que v3
				multi = v1 * v2;
			} else if (v3 < v2) { // se v3 é menor que v2
				multi = v1 * v3;
			}
		} else if (((v2 < v1) && (v1 < v3)) || ((v2 < v3) && (v3 < v1))) {
			if (v1 < v3) {
				multi = v2 * v1;
			} else if (v3 < v1) {
				multi = v2 * v3;
			}
		} else if (((v3 < v1) && (v1 < v2)) || ((v3 < v2) && (v2 < v1))) {
			if (v1 < v2) {
				multi = v3 * v1;
			} else if (v2 < v1) {
				multi = v3 * v2;
			}
		}
		// mostra na tela a multiplicação pro usuário
		JOptionPane.showMessageDialog(null, "Multiplicação dos dois valores menores: " + multi);

	}

}