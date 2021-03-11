package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para mostrar nome, celular e cidade
 * 
 * @author João Victor
 * @since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		String nome, celular, cidade;

		// atribuindo valor informado pelo usuário a variável
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		celular = JOptionPane.showInputDialog("Informe seu celular: ");
		cidade = JOptionPane.showInputDialog("Informe sua cidade: ");

		// exibindo variáveis na tela
		System.out.println("Nome: " + nome + "\n" + "Celular: " + celular + "\n" + "Cidade: " + cidade);

	}

}