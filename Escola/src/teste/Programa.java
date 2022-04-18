package teste;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno;
		aluno = new Aluno();

		aluno.setNome(JOptionPane.showInputDialog("Digite o seu nome:"));

		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));

		aluno.setMensalidade(1749.99);

		System.out.println("Seu nome é: " + aluno.getNome() + 
				"\nSua idade é: " + aluno.getIdade()
				);
		aluno.calcularDescontoMensalidade(249.99);
		

	}

}
