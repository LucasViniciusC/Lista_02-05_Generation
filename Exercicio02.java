package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		int dias, anosVividos = 0, mesesVividos = 0, diasAno = 365, diasMes = 30;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos dias que voc� j� viveu: ");
		dias  = entrada.nextInt();
		
		
		anosVividos = dias / diasAno;
		mesesVividos = dias / diasMes;
		
		System.out.println("Voc� j� viveu: " + anosVividos + " anos de vida, " + mesesVividos + " meses e " + dias + " dias.");
		
		entrada.close();
	}
}
