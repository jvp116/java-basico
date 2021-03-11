package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um número que é um código de usuário Caso este código seja
 * diferente de um código armazenado internamente no programa (igual a 1234)
 * deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja
 * correto, deve ser lido outro valor que é a senha. Se esta senha estiver
 * incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
 * Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
 * 
 * @author João Victor
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int codigo, senha;
		String msg = "";
		// recebendo informação do usuário
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código"));

		// verifica se o código digitado é diferente de '1234' caso seja mostra na tela
		// 'Usuário inválido!'
		// senão pede para informar a senha
		if (codigo != 1234) {
			JOptionPane.showMessageDialog(null, "Usuário inválido");
		} else {

			// recebe informação do usuário
			senha = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha"));

			// verifica se a senha digitada é diferente de '9999' caso seja mostra na tela
			// 'senha incorreta'
			// senão mostra 'Acesso permitido'
			if (senha != 9999) {
				msg = "senha incorreta";
			} else {
				msg = "Acesso permitido";
			}
			// mostra mensagem na tela
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}