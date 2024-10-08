import java.util.Scanner;

public class Ex2 {
	
	public static final int N=30;

	public static void main(String[] args) {
		
		int rm [] = new int [N];
		double nota1 [] = new double [N];
		double nota2 [] = new double [N];
		double media [] = new double [N];
		
		int aprovados[] = new int [N];
		
		//n é números de alunos cadastrados
		int n = entradaDados(rm, nota1,nota2);
		calculaMedia(n, nota1, nota2, media);
		
		System.out.println("\n\n Medias dos Alunos");
		for(int i =0; i <n;i++) {
			System.out.println("RM: "+ rm[i] + " \t Media = "+ media[i]);
		}
		
		int nAp = geraListaAprovados(n, media, rm, aprovados);
		
		System.out.println("\n\n Lista de Aprovados");
		for(int i =0; i <nAp;i++) {
			System.out.println("RM: "+aprovados[i]);
		}

	}
	
	public static int entradaDados(int rm[], double nota1[], double nota2[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n=0;
		System.out.print("Digite valor -1 para finalizar cadastro ou RM: ");
		int r = entrada.nextInt();
		
		while(r>0 && n<N) {
			//Atribui o ultimo valor de r!
			rm [n] = r;
			
			System.out.print("\t Digite a primeira nota do(a) aluno(a): ");
			nota1 [n] = entrada.nextDouble();
			
			System.out.print("\t Digite a segunda nota do(a) aluno(a): ");
			nota2 [n] = entrada.nextDouble();
			
			n++;
			
			System.out.print("Digite valor -1 para finalizar cadastro ou RM: ");
			r = entrada.nextInt();
		}
		entrada.close();
		
		return n;
	}
	
	public static void calculaMedia(int n, double[] nota1, double[] nota2, double[] media) {
		for (int i=0;i<n;i++) {
			media[i] = (nota1[i]+nota2[i])/2;
		}
		
	}

	public static int geraListaAprovados(int n, double media[], int rm[], int aprovados[]) {
		int nAp=0;
		
		for(int i =0;i <n;i++) {
			if(media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}
		
		return nAp;
	}
}
