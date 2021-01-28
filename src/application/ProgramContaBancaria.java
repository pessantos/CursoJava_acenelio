package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramContaBancaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaBancaria contaBancaria;

		System.out.println("Digite o numero da conta: ");
		int numero = sc.nextInt();

		System.out.println("Digite o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.println("Tem depósito inicial? (s/n)");
		char response = sc.next().charAt(0);

		if (response == 's') {
			System.out.print("Digite o deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(numero, titular, depositoInicial);
		}
		else {
			contaBancaria = new ContaBancaria(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados bancários: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double depositValue = sc.nextDouble();
		contaBancaria.depositar(depositValue);
		System.out.println("Conta atualizada: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double withdrawValue = sc.nextDouble();
		contaBancaria.sacar(withdrawValue);
		System.out.println("Conta atualizada: ");
		System.out.println(contaBancaria);

		sc.close();

	}

}
