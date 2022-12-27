package a.saida.dados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		System.out.print("Olá, Mundo! ");
		System.out.println("Bom dia!");

		int y = 32;
		double x = 10.342435;

		System.out.printf("int y: %d\n", y);
		System.out.printf("double x: %.3f\n", x);

	}

}
