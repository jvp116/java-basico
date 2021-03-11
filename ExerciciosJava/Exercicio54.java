package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para validar se os valores informados formam um triângulo
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int a, b, c;
		String msg = "";

		// recebendo informações do usuário
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se o valor de cada lado é menor que a soma dos outros 2 lados
		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			msg = "Os valores informados formam um triângulo";
		} else {
			msg = "Os valores informados NÃO formam um triângulo";
		}
		// mostra na tela a mensagem
		JOptionPane.showMessageDialog(null, msg);

	}

}