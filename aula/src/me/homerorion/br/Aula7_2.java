package me.homerorion.br;

import java.util.Scanner;

public class Aula7_2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double num1, num2, area;

		System.out.println("Digite a base do ret�ngulo: ");
		num1 = teclado.nextDouble();

		System.out.println("Digite a altura do ret�ngulo: ");
		num2 = teclado.nextDouble();

		area = (num1 * num2);

		System.out.println("A �rea do ret�ngulo �: " + area);

		teclado.close();

	}

}
