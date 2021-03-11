package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos desses valores são NEGATIVOS.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio72 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int valor = 0, negativo = 0;
		String msg = "";

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "º valor"));
			if (valor < 0) {
				negativo++;

				if (negativo == 1) {
					msg = negativo + " valor negativo";
				} else {
					msg = negativo + " valores negativos";
				}
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}