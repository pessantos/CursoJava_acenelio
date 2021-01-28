package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite as notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		if (aluno.media() >= 60) {
			System.out.printf("Media Final = %.2f%n", aluno.media());
			System.out.println("Aprovado");

		} else {
			System.out.printf("Media Final = %.2f%n", aluno.media());
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f% pontos", aluno.faltaPontos());
		}
		sc.close();
	}

}
