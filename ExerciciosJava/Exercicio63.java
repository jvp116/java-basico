package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número do empregado (código), o ano de seu nascimento e o
 * ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
 * de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não
 * requerer'.
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio63 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int codigo, anoNasce = 0, anoIngresso = 0, idade, tempoTrampo;
		String msg = "";

		// recebendo informação do usuário
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do empregado"));
		anoNasce = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do empregado"));
		anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de ingresso na empresa"));

		// calcula e escreve a idade e o tempo de trabalho
		idade = 2021 - anoNasce;
		tempoTrampo = 2021 - anoIngresso;
		msg = "EMPREGADO N° " + codigo + "\n\nIdade: " + idade + "\nTempo de trabalho: " + tempoTrampo;

		// verifica se atende os requisitos de aposentadoria e dispara mensagem
		if ((idade >= 65) || (tempoTrampo >= 30) || ((idade >= 60) && (tempoTrampo >= 25))) {
			msg += "\n\nRequerer aposentadoria";
		} else {
			msg += "\n\nNão requerer";
		}

		// mostra mensagem na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}