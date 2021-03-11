package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa em que o dono forneça a quantidade de sanduíches a fazer, e a
 * máquina informe as quantidades (em quilos) de queijo, presunto e carne
 * necessários para compra.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio29 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int sandubaFazer, queijo, presunto, carne;

		// recebendo dados do usuário e armazenando na variável
		sandubaFazer = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de sanduíches a ser feito"));

		// quantidade em gramas para se fazer um sanduíche
		// qntdQueijo <- 100 g
		// qntdPresunto <- 50 g
		// qntdCarne <- 100 g

		// calcula a quantidade de produto em quilos
		queijo = (100 * sandubaFazer) / 1000;
		carne = (100 * sandubaFazer) / 1000;
		presunto = (50 * sandubaFazer) / 1000;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "=== Quantidade a ser comprada em KG de cada produto ===\nQUEIJO: " + queijo
				+ "\n" + "CARNE: " + carne + "\n" + "PRESUNTO: " + presunto);
	}

}
