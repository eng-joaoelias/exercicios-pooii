package excecao;

/*
 * Escreva um programa que peça ao usuário para inserir um número inteiro,
 * um índice de um array. Tente acessar o elemento do array no índice
 * fornecido e trate possíveis exceções ArrayIndexOutOfBoundsException e
 * NumberFormatException.
 */

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		int indice;
		
		int[] vetor = {56, 780, 45, 2, -9, 13, 22};
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um inteiro para buscar no vetor: ");
		String indiceString = entrada.nextLine();
		
		try {
			indice = Integer.parseInt(indiceString);
			System.out.println("O elemento da posicao " + indice + "eh " + vetor[indice]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida!");
		} catch (NumberFormatException e) {
			System.out.println("Insira um NUMERO INTEIRO!");
		}
		
		entrada.close();

	}

}
