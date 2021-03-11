package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores e mostrar uma das três mensagens
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int v1, v2;
		String msg = "";

		// recebendo informação do usuário
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se v1 e v2 são iguais
		if (v1 == v2) {
			msg = "Números iguais";
		} else if (v1 > v2) { // verificando se v1 é maior que v2
			msg = "Primeiro é maior";
		} else {
			msg = "Segundo é maior";
		}
		// mostra na tela a mensagem
		JOptionPane.showMessageDialog(null, msg);
	}

}