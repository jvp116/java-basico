package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a duração de um jogo em horas
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int inicio, fim, tempo;

		// recebendo informação do usuário
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de inicio"));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de término"));

		// verificando se inicio é menor que fim quer dizer que não passou para outro
		// dia
		if (inicio < fim) {
			// calculando a duração e mostrando na tela
			tempo = fim - inicio;
			JOptionPane.showInternalMessageDialog(null, "Duração: " + tempo + " horas");
		} else {
			// calculando a duração se passar de um dia para outro e mostra na tela
			tempo = (fim - inicio) + 24;
			JOptionPane.showInternalMessageDialog(null, "Duração: " + tempo + " horas");
		}
	}

}
