package teste;

import dominio.pessoa;

public class pessoaTeste {
	
	public static void main(String[] args) {
		
		pessoa pes1 = new pessoa();
		pes1.setNome("Marcio");
		pes1.setIdade(20);
		pessoa.imprimir();
	}
}
