package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o nº de habitantes, filhos e salário de cada um e
 * depois exibir: a) Média de salário da população b) Média do número de filhos
 * c) Maior salário dos habitantes d) Percentual de pessoas com salário menor
 * que R$ 150,00
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio84 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int habitantes, filhos, mediaFilhos = 0;
		double salario, maior = 0, mediaSalario = 0, percentual = 0;

		// recebendo informações do usuário
		habitantes = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº de habitantes"));

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= habitantes; i++) {
			filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº de filhos do habitante " + i));
			do {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do habitante " + i));

			} while (salario < 0);

			mediaFilhos += filhos;
			mediaSalario += salario;

			if (salario > maior) {
				maior = salario;
			}

			if (salario < 150) {
				percentual++;
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null,
				"Média de salário da população: R$ " + (mediaSalario / habitantes) + "\nMédia do número de filhos: "
						+ (mediaFilhos / habitantes) + "\nMaior salário: " + maior
						+ "\nPercentual de pessoas com salário menor que R$ 150,00: "
						+ ((percentual * 100) / habitantes) + "%");
	}

}