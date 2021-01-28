package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class ProgramDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dolar? ");
		Conversor.preco = sc.nextDouble();
		System.out.println("Quantos dolares quer comprar? ");
		Conversor.qteDolar = sc.nextDouble();
		System.out.printf("Quantia a ser paga en reais = %.2f%n", Conversor.conversor());

		sc.close();
	}

}
