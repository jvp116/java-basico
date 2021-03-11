package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar no vetor a temperatura dos dias da semana.
 * Calcular e exibir: a) A menor temperatura da semana b) A maior temperatura da
 * semana c) Temperatura média semanal d) Nº de dias que a temperatura foi
 * inferior à média semanal
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class Exercicio100 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		String msg = "", dias = "";

		int n = 7; // tamanho do vetor com 7 posições para os dias da semana
		double temperatura[] = new double[n]; // declaração e alocação de espaço para o vetor
		int i; // índice ou posição

		// somar todos os valores, definir o maior, o menor valor e a média
		double soma = 0;
		double media = 0;
		double menor = Double.MAX_VALUE; // vai armazenar na variável o maior valor possível.
		double maior = Double.MIN_VALUE;

		// variável para contar dias que a temperatura foi inferior à média semanal
		int contador = 0;

		// processando os "n" elementos do vetor
		for (i = 0; i < n; i++) {

			if ((i == 0)) {
				dias = "Domingo";
			} else if (i == 1) {
				dias = "Segunda-feira";
			} else if (i == 2) {
				dias = "Terça-feira";
			} else if (i == 3) {
				dias = "Quarta-feira";
			} else if (i == 4) {
				dias = "Quinta-feira";
			} else if (i == 5) {
				dias = "Sexta-feira";
			} else if (i == 6) {
				dias = "Sábado";
			}
			// na i-ésima posição do vetor armazena o valor
			temperatura[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a temperatura média (°C) de " + dias));

			// somando as temperaturas em memória
			soma += temperatura[i];

			if (temperatura[i] < menor) {
				menor = temperatura[i];
			}

			if (temperatura[i] > maior) {
				maior = temperatura[i];
			}

		}

		// calculando a média semanal de temperatura
		media = soma / 7;

		for (int j = 0; j < temperatura.length; j++) {
			if (temperatura[j] < media) {

				contador++;
			}
		}

		DecimalFormat casa2 = new DecimalFormat("#,###.00");

		// concatenando os resultados na String 'msg' para mostrar no JOptionPane
		msg += "A menor temperatura da semana: " + casa2.format(menor) + " °C";
		msg += "\nA maior temperatura da semana: " + casa2.format(maior) + " °C";
		msg += "\nTemperatura média semanal: " + casa2.format(media) + " °C";
		msg += "\nDias da semana que a temperatura foi inferior à média semanal: " + contador;

		// Saída (resultados)
		// mostra na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}