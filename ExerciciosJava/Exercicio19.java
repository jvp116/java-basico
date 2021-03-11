package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o salário mensal atual de um funcionário e o percentual de
 * reajuste. Calcular e escrever o valor do novo salário;
 *
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio19 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double salario, reajuste, novo;

		// recebendo dados do usuário e armazenando nas variáveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário"));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual do reajuste"));

		// calculando o novo salário com reajuste
		novo = (salario * (reajuste / 100)) + salario;

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Salário reajustado: R$ " + novo);
	}

}