package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a largura e altura do retângulo: ");
		System.out.println("Largura: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("Altura: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("ÁREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

		sc.close();
	}

}
