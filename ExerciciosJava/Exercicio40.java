package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o ano atual e de nascimento, mostra se pode ou não votar
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int nasce, atual, idade;

		// recebendo informação do usuário
		nasce = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento"));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual"));

		// calculando a idade
		idade = atual - nasce;

		// verificando se a idade vai ser negativa ou igual a zero
		if (idade <= 0) { // mostrando na tela mensagem de erro
			JOptionPane.showMessageDialog(null, "Informe valores válidos");
		} else if (idade > 16) { // verifica se idade é maior que 16 e informa na tela
			JOptionPane.showMessageDialog(null, "Você poderá votar este ano!");
		} else {
			JOptionPane.showMessageDialog(null, "Você NÃO poderá votar este ano!");
		}

	}

}
