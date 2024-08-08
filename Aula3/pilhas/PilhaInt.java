package pilhas;

public class PilhaInt {
	
	public final int N = 6;
	int dados[] = new int[N];
	//TOPO sempre será inteiro
	int topo;
	
	
	public void init() {
		topo = 0;
	}
	
	//Quando chamar o método, precisamos falar o elemento que será acrescentado
	public void push(int elem) {
		if(isFull())
			System.out.println("Stack Overflow");
		else {
			dados[topo] = elem;
			topo++;
		}
	}
	
	//Verificação se a pilha está vazia
	public boolean isEmpty(){
		if (topo == 0) 
			return true;
		else
			return false;
	}
	
	//Verificação se a pilha está cheia
	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}
	
	//Ver o topo da pilha
	public int top(){
		return (dados[topo-1]);
	}
	
	//Diminui o índice e retorna o índice anterior
	public int pop() {
		topo--;
		return (dados[topo]);
	}
	
	//Deixar a pilha vazia
	public void empty() {
		while (!isEmpty()) 
			System.out.println("\t" + pop());
	}
	


}
