package estrutura_while;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int idade = 0, sub21 = 0, sub50 = 0;
		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade < 21) {
				sub21++;
			} else if (idade > 50) {
				sub50++;
			}
		}
		System.out.println("O numero de pessoas menores de 21 anos " + sub21);
		System.out.println("O numero de pessoas maiores de 50 anos " + sub50);
	}

}
