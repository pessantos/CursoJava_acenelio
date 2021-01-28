package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Digite o nome do produto: ");
		String name = sc.nextLine();
		System.out.println("Digite o preço do produto: ");
		Double price = sc. nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		int quantity = sc.nextInt();
		
		Produto produto = new Produto(name, price, quantity);
		
		System.out.println(produto);
		
		System.out.println("Quantos produtos quer adicionar? ");
		quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println("Updated data: " + produto);
		
		System.out.println("Quantos produtos quer remover? ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println("Updated data: " + produto);
		

		sc.close();
	}



}
