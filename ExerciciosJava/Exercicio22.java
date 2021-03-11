package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que leia o número de carros por ele vendidos, o valor total de suas
 * vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e
 * escreva o salário final do vendedor.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio22 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int carros_vendidos;
		double total_vendas, salario_fixo, valor_por_carro, salario_final, comissao_fixa;

		// recebendo dados do usuário e armazenando nas variáveis
		carros_vendidos = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros vendidos do vendedor"));
		total_vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas"));
		salario_fixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo do vendedor"));
		valor_por_carro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor recebido por carro vendido"));

		comissao_fixa = 0.1;
		// calculando a área do retângulo
		salario_final = salario_fixo + ((carros_vendidos * valor_por_carro) * comissao_fixa) + (total_vendas * 0.05);

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "O salário final do vendedor é: R$ " + salario_final);
	}

}
