package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o valor da taxa: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Nome: " + funcionario.name); 
		System.out.printf("Salario: R$ %.2f%n", funcionario.netSalary());
		
		System.out.println("Qual a procentagem para aumento do salario: ");
		funcionario.percentage = sc.nextDouble();
		
		System.out.printf("Salario atualizado: R$ %.2f%n", funcionario.increaseSalary());
		sc.close();

	}

}
