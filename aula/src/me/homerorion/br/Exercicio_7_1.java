package me.homerorion.br;

import java.util.Scanner;

public class Exercicio_7_1 {

	public static void main(String[] args) {
	
		/*01 - Escreva um algoritmo em pseudocódigo e depois o transcreva para Java, o algoritmo 
			deve LER um valor (do teclado) e ESCREVER (na tela) o seu antecessor.*/
		
		Scanner sc = new Scanner(System.in);

		int num1;

		System.out.println("Digite um número: ");
		num1 = sc.nextInt();

		System.out.println("\nO antecessor de" + num1 + "é o" + (num1 - 1) + ".");

		sc.close();
	}

}
