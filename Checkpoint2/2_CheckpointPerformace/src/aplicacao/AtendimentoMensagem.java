package aplicacao;
import java.util.Scanner;
import entidades.Mensagem;
import fila.FilaMensagens;

public class AtendimentoMensagem {

	
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		
		//instÂnciando as três filas! 
		
		//Criação da filaReclamacao com 30
		FilaMensagens filaReclamacao = new FilaMensagens();
		//Criação da filaSugestao com 30
		FilaMensagens filaSugestao = new FilaMensagens();
		//Criação da filaResolucao com 30
		FilaMensagens filaResolucao = new FilaMensagens();
		
		//inicialização das 3 filas
		filaReclamacao.init();
		filaSugestao.init();
		filaResolucao.init();
		
		int opcao = 0;
		do {
			
			System.out.println(" 0 - Encerra o programa");
			System.out.println(" 1 - Recebimeto de Mensagem");
			System.out.println(" 2 - Atendimento de Mensagem");
			System.out.println(" 3 - Recebimento e Encaminhamento de Resolução");
			//lê a opção escolhida
			opcao = le.nextInt();
			
			switch (opcao) {
			case 0:
				if(filaReclamacao.isEmpty() && filaResolucao.isEmpty() && filaSugestao.isEmpty()) {
					System.out.println("Encerrando programa...");
				}
				else {
					System.out.println("Existe algumas mensagens ainda!!");
					//Um jeito de permitir o loop
					opcao = -1;
				}
				
				break;
			
			case 1:
				//Limpa o último next: opcao = le.nextInt();
				le.nextLine();
				
				System.out.println("Nome(opcional): ");
				String nome = le.next();
				
				System.out.println("Email/Telefone: ");
				String emailTelefone = le.next();
				
				System.out.println("Motivo do contato (1 - reclamação / 2 - sugestão): ");
				int motivoContato = le.nextInt();
				
				//Validação
				while (motivoContato != 1 || motivoContato != 2) {
					System.out.println("Digite corretamente o motivo do contato (1 - reclamação / 2 - sugestão): ");
					motivoContato = le.nextInt();
				}
				
				System.out.println("Mensagem (texto): ");
				String texto = le.nextLine();
				
				//Guardando os dados do usuario no objeto mensagem
				if(nome != null){
					//Instânciando mensagem
					Mensagem mensagem = new Mensagem(nome, emailTelefone,motivoContato,texto);
					
					//Indo na sua devida fila
					if(motivoContato == 1) {
						filaReclamacao.enqueue(mensagem);
					} else {
						if(motivoContato == 2) {
							filaSugestao.enqueue(mensagem);
						} 
					}
					
				} else {
					Mensagem mensagem = new Mensagem(emailTelefone,motivoContato,texto);
					
					//Indo na sua devida fila
					if(motivoContato == 1) {
						filaReclamacao.enqueue(mensagem);
					} else {
						if(motivoContato == 2) {
							filaSugestao.enqueue(mensagem);
						} 
					}
					
				}
				
				break;
				
			case 2:
				
				//Perguntar qual fila vai querer atender
				System.out.println("Escolha o tipo de mensagem que será respondido (1 - reclamação / 2 - sugestão): ");
				int atendimentoTipoMensagem = le.nextInt();
				
				//Validação
				while (atendimentoTipoMensagem != 1 || atendimentoTipoMensagem != 2) {
					System.out.println("Digite corretamente o tipo de mensagem que será respondido (1 - reclamação / 2 - sugestão): ");
					motivoContato = le.nextInt();
				}
				
				if(atendimentoTipoMensagem == 1) {
					//getDados para mostrar as informações
					
					
					
					filaReclamacao.dequeue();
					//Encaminhar para outro setor
					
					
					//Confirmação para solucionar
					
				} else {
					filaSugestao.dequeue();
				}
				
				break;
			
			case 3:
				
				break;

			default:
				break;
			}
			
		} while (opcao != 0);
		
		le.close();

	}
}
