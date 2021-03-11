package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula quantos litros água e de suco são necessários para se
 * fazer a quantidade de litros que o usuário informou
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio34 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double agua, suco, xLitros;

		// recebendo dados do usuário e armazenando na variável
		xLitros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em Litros deseja"));

		// calcula a quantidade necessária de água e de suco de acordo com os Litros que
		// o usuário deseja
		agua = (0.8) * xLitros;
		suco = (0.2) * xLitros;

		// mostra quantidade de água e suco de maracujá são necessários para x Litros
		JOptionPane.showMessageDialog(null,
				"Precisa de " + agua + " litros de água e " + suco + " litros de suco de maracujá");
	}

}
