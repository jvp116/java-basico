package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as dimensões de um retângulo (base e altura), calcular e
 * escrever a área do retângulo;
 *
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio16 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double b, a, area;

		// recebendo dados do usuário e armazenando nas variáveis
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// calculando a área do retângulo
		area = b * a;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "ÁREA DO RETÂNGULO " + area);
	}

}