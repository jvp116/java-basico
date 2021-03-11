package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o custo de fábrica de um carro, calcular e escrever o custo
 * final ao consumidor.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio21 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double custoFabrica, distribuidor, impostos, custoFinal;

		// recebendo dados do usuário e armazenando na variável
		custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica"));

		// atribuindo valor as variáveis
		distribuidor = 0.28;
		impostos = 0.45;

		// calculando o custo final
		custoFinal = (custoFabrica * distribuidor) + (custoFabrica * impostos) + custoFabrica;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Custo final do carro é: R$" + custoFinal);
	}

}