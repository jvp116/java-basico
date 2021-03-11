package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler nº conta cliente, saldo, débito e crédito. Calcula e
 * escreve o saldo atual
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int conta;
		double saldo, deb, cred;
		String msg = "";

		// recebendo informações do usuário
		conta = Integer.parseInt(JOptionPane.showInputDialog("Insira o n° da conta"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo"));
		deb = Double.parseDouble(JOptionPane.showInputDialog("Informe o débito"));
		cred = Double.parseDouble(JOptionPane.showInputDialog("Informe o crédito"));

		// calculando saldo atual
		saldo = saldo - deb + cred;

		// verificando se o saldo é maior igual a 0
		if (saldo >= 0) { // atribuindo valor a variável msg
			msg = "\n\nSaldo Positivo";
		} else {
			msg = "\n\nSaldo Negativo";
		}
		// mostrando na tela o saldo atual e se é positivo ou negativo
		JOptionPane.showMessageDialog(null, "CONTA " + conta + "\n\nSaldo Atual: R$ " + saldo + msg);
	}

}