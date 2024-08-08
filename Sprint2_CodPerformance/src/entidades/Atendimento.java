package entidades;

public class Atendimento {
	private int id_funcionario;
	private String feedback, consumidor, produto;
	
	public Atendimento(int id_funcionario, String feedback, String consumidor, String produto) {
		super();
		this.id_funcionario = id_funcionario;
		this.feedback = feedback;
		this.consumidor = consumidor;
		this.produto = produto;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getConsumidor() {
		return consumidor;
	}

	public void setConsumidor(String consumidor) {
		this.consumidor = consumidor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "id_funcionario =" + id_funcionario + ", feedback =" + feedback + ", consumidor =" + consumidor
				+ ", produto =" + produto;
	}
	
	
	
	
}
