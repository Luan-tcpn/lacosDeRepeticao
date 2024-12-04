package estrutura_do_while;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int num, soma = 0;
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if(num > 0) {
				soma += num;
			}
			
		} while(num != 0);
		
		System.out.println("A soma dos numeros positivos é: " + soma );
	}

}
