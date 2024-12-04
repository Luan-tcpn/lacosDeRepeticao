package estrutura_for;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int num, i, impar = 0, par = 0;
		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Total de numeros pares: " + par);
		System.out.println("Total de numeros impares: " + impar);
	}
	

}
