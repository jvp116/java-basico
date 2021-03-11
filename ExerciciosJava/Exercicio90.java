package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para solicitar números para o usuário e armazenar em um vetor de 20
 * posições (aceitar somente números positivos). Escrever a seguir o valor do
 * maior elemento e a respectiva posição que ele ocupa no vetor.
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class Exercicio90 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a variável msg para receber a saída de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		int num[] = new int[20];

		// variável auxiliar declarada e inicializada para receber o maior nº do vetor
		int maior = 0;

		// variável auxiliar para receber o índice/posição do maior valor
		int indiceMaior = 0;

		// loop FOR; inicializando a variável; condicionando e incrementando
		for (int i = 0; i < num.length; i++) {

			// loop que se repete caso o valor digitado seja negativo (só aceita valores
			// positivos)
			do {
				num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da posição " + (i + 1)));
			} while (num[i] < 0);

			// condicional para verificar o maior elemento do array
			if (num[i] > maior) {
				maior = num[i];
				indiceMaior = i;
			}
		}
		// atribuindo valores e concatenando à variável msg
		msg += "Maior elemento: " + maior;
		msg += "\nNa posição: " + indiceMaior;

		// Saída dos dados (resultado)
		JOptionPane.showMessageDialog(null, msg);
	}

}
