package estrutura_for;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int num1, num2, i;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextInt();

		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();

		if (num1 < num2) {
			for (i = num1; i <= num2; i = num1++) {
				if (num1 % 3 == 0 && num1 % 5 == 0) {
					System.out.println("O numero: " + num1 + " é divisivel por 3 e 5");
				}
			}

		} else {
			System.out.println("Intervalo invalido.");
		}

	}

}
