package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos desses valores lidos estão no
 * intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles
 * estão fora deste intervalo.
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class Exercicio73 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int valor = 0, intervalo = 0, foraIntervalo = 0;

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "º valor"));
			if ((valor >= 10) && (valor <= 20)) {
				intervalo++;
			} else {
				foraIntervalo++;
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Dos 10 valores informados\n\nEstão no intevalo [10, 20]: " + intervalo
				+ "\nNão estão no intervalo: " + foraIntervalo);
	}

}