package exercicio5;

import java.util.Scanner;

import filas.FilaString;


public class Consultorio {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaString filaPacientes = new FilaString();
		filaPacientes.init();
		
		int opcao;
		do {
			System.out.println(" 0 - Encerrar o atendimento");
			System.out.println(" 1 - Inserir paciente na fila");
			System.out.println(" 2 - Atender 1 paciente");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				if(filaPacientes.isEmpty()) {
					System.out.println("Atendimento encerrado!!");
				}
				else {
					System.out.println("Ainda ha pacientes aguardado na fila...");
					//Um jeito de permitir o loop
					opcao = -1;
				}
				break;
			case 1:
				//Limpa o último next: opcao = le.nextInt();
				le.nextLine();
				System.out.print("Informe nome: ");
				String nome = le.nextLine();
				filaPacientes.enqueue(nome);
				break;
			case 2:
				if(filaPacientes.isEmpty()) {
					System.out.println("Nao ha aluno para serem atendidos...");
				}
				else
					System.out.println("Próximo pacientes para atendimento:"+ " " +filaPacientes.dequeue());
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}while (opcao!=0);
		
		
		le.close();

	}

}
