package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e calcular quantidade atual, máxima e mínima em estoque do
 * produto
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int atual, max, min, qtdMedia;
		String msg = "";

		// recebendo informação do usuário
		atual = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade atual em estoque"));
		max = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade máxima para estoque"));
		min = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima para estoque"));

		// calculando e mostrando a quantidade média
		qtdMedia = (max + min) / 2;

		// verifica se a quantidade em estoque é maior ou igual a quantidade média
		if (atual >= qtdMedia) {
			msg = "\n\nNão efetuar compra";
		} else {
			msg = "\n\nEfetuar compra";
		}
		// mostra na tela a quantidade média e se deve ou não efetuar a compra
		JOptionPane.showMessageDialog(null, "Quantidade média: " + qtdMedia + msg);
	}

}