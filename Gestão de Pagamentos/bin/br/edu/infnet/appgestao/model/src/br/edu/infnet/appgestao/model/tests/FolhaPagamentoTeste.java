package br.edu.infnet.appgestao.model.tests;

import br.edu.infnet.appgestao.model.domain.Empresa;
import br.edu.infnet.appgestao.model.domain.FolhaPagamento;

public class FolhaPagamentoTeste {
	
	public static void main(String[] args) {
		
		Empresa empresa1 = new Empresa("Cozinha do Programador", 999888777, "cozinhadoprogramador.java@gmail.com");
		
		FolhaPagamento f1 = new FolhaPagamento();
		f1.setPlanoSaude(true);
		f1.setValeAlimentacao(true);
		System.out.println("Dados empresa: " + empresa1);
		System.out.println("Dados folha de pagamento: " + f1);
	}
}
