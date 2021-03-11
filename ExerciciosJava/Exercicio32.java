package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular quantos litros de refrigerante ele comprou.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio32 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double lata, garrafa, litrao, total;

		// recebendo dados do usuário e armazenando nas variáveis
		lata = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de lata de 350ml comprada"));
		garrafa = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de garrafa de 600ml comprada"));
		litrao = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de garrafa de 2L comprada"));

		// calcula o total em litros de Meia-cola
		// lata 350ml = 0.35L
		// garrafa 600ml = 0.6L
		total = (lata * 0.35) + (garrafa * 0.6) + (litrao * 2);

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "quantidade total em litros é: " + total);
	}

}
