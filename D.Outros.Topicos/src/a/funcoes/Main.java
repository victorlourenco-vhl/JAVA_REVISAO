package a.funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com três numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);

		mostrarResultado(maior);

	}

	public static int max(int a, int b, int c) {

		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		}

		return c;
	}

	public static void mostrarResultado(int resultado) {
		System.out.println("O maior número é: " + resultado);
	}

}
