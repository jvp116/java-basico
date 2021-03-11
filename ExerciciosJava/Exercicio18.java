package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número total de eleitores de um município, o número de
 * votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
 * representa em relação ao total de eleitores;
 *
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio18 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int eleitores, brancos, nulos, validos;
		// recebendo dados do usuário e armazenando nas variáves
		eleitores = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de eleitores"));
		brancos = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de votos BRANCOS"));
		nulos = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de votos NULOS"));
		validos = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de votos VALIDOS"));

		// calculando
		brancos = (brancos * 100) / eleitores;
		nulos = (nulos * 100) / eleitores;
		validos = (validos * 100) / eleitores;
		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Total de eleitores: " + eleitores + "\n" + "Votos BRANCOS: " + brancos
				+ "% \n" + "Votos NULOS: " + nulos + "% \n" + "Votos VALIDOS: " + validos + "%");
	}

}