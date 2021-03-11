package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e escrever uma mensagem se é ou não maior que 10
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		double valor;

		// pedindo para o usuário informar um valor
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));

		// verificando se é maior que 10
		if (valor > 10) { // exibindo mensagem na tela
			JOptionPane.showInternalMessageDialog(null, "É MAIOR QUE 10");
		} else {
			JOptionPane.showInternalMessageDialog(null, "NÃO É MAIOR QUE 10");
		}

	}

}
