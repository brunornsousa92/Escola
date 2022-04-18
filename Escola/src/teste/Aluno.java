package teste;

public class Aluno {

	private String nome;
	private int idade;
	private double mensalidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	void calcularDescontoMensalidade(double desconto){
		double descontoMensalidade = 0;
		descontoMensalidade = this.mensalidade - desconto;
		System.out.println("Agora sua mensalidade é: " + descontoMensalidade);
	}

}
