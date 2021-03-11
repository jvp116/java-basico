package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escreve o menor deles
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio49 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int v1, v2, v3;
		String msg = "";
		// recebendo informação do usuário
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando o menor dos 3 valores
		if (((v1 < v2) && (v2 < v3)) || ((v1 < v3) && (v3 < v2))) {
			msg = ": " + v1;
		} else if (((v2 < v1) && (v1 < v3)) || ((v2 < v3) && (v3 < v1))) {
			msg = ": " + v2;
		} else if (((v3 < v1) && (v1 < v2)) || ((v3 < v2) && (v2 < v1))) {
			msg = ": " + v3;
		}
		// msotrando mensagem na tela
		JOptionPane.showMessageDialog(null, "Menor valor" + msg);

	}

}