package teste;

import dominio.aluno;

public class alunoTeste {
	
	public static void main(String[] args) {
		
		aluno alun1 = new aluno();
		alun1.setNome("Marcio");
		alun1.setIdade(20);
		alun1.setAv1(10);
		alun1.setAv2(10);
		aluno.imprimir();
	}
}
