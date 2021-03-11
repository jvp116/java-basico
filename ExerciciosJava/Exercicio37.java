package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e escrever se é positivo ou negativo
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		double valor;

		// recebendo informação do usuário
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));

		// verificando se o valor é maior ou igual a zero
		if (valor >= 0) { // mostrando mensagem na tela
			JOptionPane.showMessageDialog(null, "é positivo");
		} else {
			JOptionPane.showMessageDialog(null, "é negativo");
		}
	}

}
