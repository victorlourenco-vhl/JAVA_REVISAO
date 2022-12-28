package c.entrada.dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		nome = sc.next();
		
		int idade;
		idade = sc.nextInt();
		
		double salario;
		salario = sc.nextDouble();
		
		char genero;
		genero = sc.next().charAt(0);
		
		String mensagem;
		sc.nextLine(); // consumir a quebra de linha pendente
		mensagem = sc.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Gênero: " + genero);
		System.out.println("Mensagem: " + mensagem );		
		
		sc.close();
		
	}
	
}
