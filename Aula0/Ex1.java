import java.util.Scanner;

public class Ex1 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Criação de uma constante (final = a variavel N é uma constatante)
		final int N =30;
		
		int rm [] = new int [N];
		double nota1 [] = new double [N];
		double nota2 [] = new double [N];
		
		int aprovados[] = new int [N];
		double media[] = new double[N];
		
		int n=0; //quantidade de alunos da sala
		
		System.out.print("Digite valor -1 para finalizar cadastro ou RM: ");
		int r = entrada.nextInt();
		
		while(r>0 && n<N) {
			//Atribui o ultimo valor de r!
			rm [n] = r;
			
			System.out.print("\t Digite a primeira nota do(a) aluno(a): ");
			nota1 [n] = entrada.nextDouble();
			
			System.out.print("\t Digite a segunda nota do(a) aluno(a): ");
			nota2 [n] = entrada.nextDouble();
			
			media[n] = (nota1[n] + nota2[n])/2;
			
			n++;
			
			System.out.print("Digite valor -1 para finalizar cadastro ou RM: ");
			r = entrada.nextInt();
		}
		
		
		//Saída
		System.out.println("\n\n Medias dos Alunos");
		for(int i =0; i <n;i++) {
			System.out.println(rm[i] + " - "+ media[i]);
		}
		
		int nAp=0;
		
		for(int i =0;i <n;i++) {
			if(media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}
		
		System.out.println("\n\n Lista de Aprovados");
		for(int i =0; i <nAp;i++) {
			System.out.println("RM: "+aprovados[i]);
		}
		
		//Fechamento do Scanner
		entrada.close();
			
	}

}
