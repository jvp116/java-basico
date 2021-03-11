package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		double n1, n2, media;
		String msg = "";

		// recebendo informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota"));

		// calculando a média
		media = (n1 + n2) / 2;

		msg = "Média: " + media + "\n";
		// verificando se a média
		if (media >= 6) {
			msg += "\nAPROVADO";
			JOptionPane.showMessageDialog(null, msg);
		} else {
			msg += "\nREPROVADO";
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
