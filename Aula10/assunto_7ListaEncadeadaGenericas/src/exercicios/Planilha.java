package exercicios;

import java.util.Scanner;

import entidades.Aluno;
import listas.ListaAlunos;

public class Planilha {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		
		ListaAlunos turma = new ListaAlunos();
		
		int resp;
		do {
			System.out.print("\t RM: ");
			int rm = le.nextInt();
			System.out.print("\t Media: ");
			double media = le.nextDouble();
			Aluno aluno = new Aluno(rm,media);
			turma.insere(aluno);
			turma.apresenta();
			
			
			System.out.print("Deseja cadastrar mais 1 aluno? (1-sim)");
			resp = le.nextInt();
		} while (resp ==1);
		
		le.close();

	}

}
