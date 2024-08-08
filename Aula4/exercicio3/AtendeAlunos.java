package exercicio3;

import java.util.Scanner;

import filas.FilaInt;

public class AtendeAlunos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FilaInt filaAlunos = new FilaInt();
		int opcao = 0, rm = 0;
		
		filaAlunos.init();
		do {
			
			System.out.println(" 0 - encerrar");
			System.out.println(" 1 - Inserir aluno na fila");
			System.out.println(" 2 - Atender 1 aluno");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Informe RM: ");
				rm = teclado.nextInt();
				filaAlunos.enqueue(rm);
				break;
			
			case 2:
				filaAlunos.dequeue();
				break;
				
			case 0:
				if(filaAlunos.isEmpty())
					System.out.println("Finalizando o programa");
				break;	
			default:
				System.out.println("Opção invalido");
				break;
			} 

		}while(opcao != 0);
	}
}
