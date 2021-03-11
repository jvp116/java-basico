package exercicios;

import javax.swing.JOptionPane;

/**
 * Entrar com o dia e o mês de uma data e informar quantos dias se passaram
 * desde o início do ano. Esqueça a questão dos anos bissextos e considere
 * sempre que um mês possui 30 dias.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio26 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int dia, mes, dias_passados;
		// recebendo dados do usuário e armazenando nas variáveis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia atual"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês atual"));

		// calculando dias que se passaram
		dias_passados = dia + (mes * 30) - 30;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Já se passaram: " + dias_passados + " desde o início do ano");
	}

}
