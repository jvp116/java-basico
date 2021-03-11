package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a idade de uma pessoa expressa em anos, meses e dias e
 * escreva a idade dessa pessoa expressa apenas em dia. Considerar ano com 365
 * dias e mês com 30 dias
 *
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio17 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int anos, meses, dias, idade;

		// recebendo dados do usuário e armazenando nas variáves
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento"));

		// calculando idade em dias
		idade = ((2021 - anos) * 365) + (meses * 30) + dias;
		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Idade em dias é: " + idade);
	}

}