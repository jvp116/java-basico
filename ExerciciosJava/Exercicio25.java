package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o preço do litro da gasolina e o valor do pagamento, e
 * exibir quantos litros ele conseguiu colocar no tanque.
 * 
 * @author João Victor
 * @since 05/02/2021
 *
 */
public class Exercicio25 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double preco, pagamento;

		// recebendo dados do usuário e armazenando nas variáveis
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do litro"));
		pagamento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do pagamento"));

		// mostrando na tela pro usuário
		JOptionPane.showMessageDialog(null, "Quantidade de litros colocados no tanque: " + (pagamento / preco));
	}

}
