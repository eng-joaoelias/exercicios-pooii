package excecao;

/*
 * Escreva um método validarIdade(int idade) que lança uma IllegalArgumentException
 * se a idade for negativa. Use esse método em um programa principal e trate
 * a exceção adequadamente.
 */

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		int idade = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sua idade>>");
		
		idade = entrada.nextInt();
		
		try {
			validarIdade(idade);
		} catch (IllegalArgumentException e) {
			System.out.println("A idade nao pode ser negativa.");
		}
		
		entrada.close();
	}
	
	public static void validarIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade negativa!");
		} else {
			System.out.println("Idade válida!");
		}
	}
}
