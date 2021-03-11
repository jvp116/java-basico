package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular horas trabalhadasno mês e informa o salário total com
 * cálculo das horas extras
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		double trab, salarioHora, salarioTotal, extra;

		// recebendo informação do usuário
		trab = Double.parseDouble(JOptionPane.showInputDialog("Informe suas horas trabalhadas no mês"));
		salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário por hora"));

		// verificando se horas trabalhadas foram maior que 40 horas e calcula os
		// acréscimos das horas extras
		if (trab > 160) {
			extra = trab - 160;
			salarioTotal = (salarioHora * trab) + ((extra * salarioHora) * 0.5);
			JOptionPane.showMessageDialog(null,
					"O salário total com os acréscimos das horas extras é: R$ " + salarioTotal);
		} else { // calcula o salário no mês sem acréscimos
			salarioTotal = salarioHora * trab;
			JOptionPane.showMessageDialog(null, "O salário total é: R$ " + salarioTotal);
		}
	}

}
