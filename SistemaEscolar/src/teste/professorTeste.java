package teste;

import dominio.professor;

public class professorTeste {
	public void main(String[] args) {
		
		professor prof1 = new professor();
		prof1.setNome("Marcio");
		prof1.setIdade(20);
		prof1.setSalario(1000);
		professor.imprimir();
	}
}
