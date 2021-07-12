package br.edu.infnet.appgestao.model.tests;

import br.edu.infnet.appgestao.model.domain.Atendimento;
import br.edu.infnet.appgestao.model.domain.Cozinha;
import br.edu.infnet.appgestao.model.domain.Gerente;
import br.edu.infnet.appgestao.model.exceptions.EnderecoInvalidoException;
import br.edu.infnet.appgestao.model.exceptions.IdadeInvalidaException;
import br.edu.infnet.appgestao.model.exceptions.NomeInvalidoException;

public class FuncionarioTeste {
	public static void main(String[] args) throws NomeInvalidoException, IdadeInvalidaException, EnderecoInvalidoException {
		
		Gerente g1 = new Gerente("Gerente","Marcio", 18, "Araruama", 2500);
		g1.setAdcDisp(100);
		g1.setAdcResp(200);
		g1.setAdcGratificacao(500);
		System.out.println("Dados do funcionario: " + g1.dadosFuncionario());
		
		Gerente g2 = new Gerente("Gerente","Elberth", 30, "Rio de Janeiro", 3500);
		g2.setAdcDisp(150);
		g2.setAdcResp(300);
		g2.setAdcGratificacao(600);
		System.out.println("Dados do funcionario: " + g2.dadosFuncionario());
		
		Cozinha c1 = new Cozinha("Cozinha","Raquel", 35, "Cabo Frio", 1200);
		c1.setHrExtraCozinha(22);
		c1.setAdcPericulosidade(300);
		c1.setDescCozinha(100);
		System.out.println("Dados do funcionario: " + c1.dadosFuncionario());
		
		Cozinha c2 = new Cozinha("Cozinha","Henrique", 25, "Saquarema", 1000);
		c2.setHrExtraCozinha(20);
		c2.setAdcPericulosidade(300);
		c2.setDescCozinha(100);
		System.out.println("Dados do funcionario: " + c2.dadosFuncionario());
		
		Atendimento a1 = new Atendimento("Atendimento","Lucas", 19, "Araruama", 1100);
		a1.setHrExtraAtend(15);
		a1.setComissao(400);
		a1.setDescAtend(110);
		System.out.println("Dados do funcionario: " + a1.dadosFuncionario());
		
		Atendimento a2 = new Atendimento("Atendimento","Maycon", 18, "Araruama", 900);
		a2.setHrExtraAtend(19);
		a2.setComissao(350);
		a2.setDescAtend(80);
		System.out.println("Dados do funcionario: " + a2.dadosFuncionario());
	}
}
