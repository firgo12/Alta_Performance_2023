package exercicio4;

import java.util.Scanner;

import pilhas.PilhaInt;

public class Main {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		
		Scanner le = new Scanner(System.in);
		
		int decimal, resto;
		
		
		System.out.print("Informe valor decimal: ");
		decimal = le.nextInt();
		
		
		while (decimal != 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		
		System.out.print("Valor em binario: ");
		pilha.empty();

		le.close();
	}

}
