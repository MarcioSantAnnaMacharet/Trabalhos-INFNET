package br.edu.infnet.appgestao.model.tests;

import br.edu.infnet.appgestao.model.domain.Empresa;

public class EmpresaTeste {
	
	public static void main(String[] args) {
		
		Empresa e1 = new Empresa("Cozinha do Programador", 999888777, "cozinhadoprogramador.java@gmail.com");
		System.out.println("Empresa: " + e1);
	}
}

