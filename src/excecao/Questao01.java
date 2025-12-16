package excecao;

/*
 * Escreva um programa que peça ao usuário para inserir dois números e tente dividir
 * o primeiro pelo segundo. Capture a possível exceção ArithmeticException e exiba
 * uma mensagem apropriada ao usuário.
 */

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		int num1, num2, resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		num2 = entrada.nextInt();
		
		try {
			resultado = num1 / num2;
			System.out.println("Resultado da divisao de " + num1 + " por " + num2 + " = " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Impossível dividir por zero!");
		}
		
		entrada.close();

	}

}
