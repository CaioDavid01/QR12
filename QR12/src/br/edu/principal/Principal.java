package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double base;
		do {
			System.out.print("Digite o primeiro numero (base): ");
			base = scanner.nextDouble();
			
		}while (base <= 0);
		
		
		double expoente;
		do {
			System.out.print("Digite o segundo numero (expoente): ");
			expoente = scanner.nextDouble();
			
		}while (expoente <= 0);
		
		double resultado = Math.pow(base, expoente);
		System.out.println(base + "elevado a" + expoente + "é igual a " + resultado);
		
		scanner.close();
		
		
		

	}
	
}
