package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler salário fixo e valor de vendas, calcular e escrever o
 * salário total
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		double salarioFixo, valorVendas, salarioTotal;

		// recebendo informação do usuário
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo"));
		valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de vendas efetuadas"));

		// verificando se o valor total das vendas do vendedor é até 1500 reais
		if (valorVendas <= 1500) {
			salarioTotal = salarioFixo + (valorVendas * 0.03);
		} else {
			valorVendas = valorVendas - 1500;
			salarioTotal = salarioFixo + (1500 * 0.03 + (valorVendas * 0.05));
		}

		JOptionPane.showMessageDialog(null, "O salário total do vendedor foi de: R$ " + salarioTotal);
	}

}
