package estrutura_do_while;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int num, contador = 0, soma = 0;
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			
			if(num % 3 == 0) {
				soma += num;
				contador++;
			}
			
		} while(num != 0);
		
		System.out.println("A media de todos os numeros multiplos de 3 é: " + soma/contador);
	}
	
}
