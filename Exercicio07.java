package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, d, e, f, x, y;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o 1� n�mero: ");
		a = entrada.nextDouble();
		System.out.println("Informe o 2� n�mero: ");
		b = entrada.nextDouble();
		System.out.println("Informe o 3� n�mero: ");
		c = entrada.nextDouble();
		System.out.println("Informe o 4� n�mero: ");
		d = entrada.nextDouble();
		System.out.println("Informe o 5� n�mero: ");
		e = entrada.nextDouble();
		System.out.println("Informe o 6� n�mero: ");
		f = entrada.nextDouble();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("O valor de X �: " + x);
		System.out.println("O valor de Y �: " + y);

		entrada.close();
	}
}
