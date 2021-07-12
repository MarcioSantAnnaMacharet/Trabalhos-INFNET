package br.edu.infnet.appgestao.model.domain;

public class Atendimento extends Funcionario {
	
	private float hrExtraAtend;
	private float comissao;
	private float descAtend;

	public Atendimento(String tipo, String nome, int idade, String endereco, float salario) {
		super(tipo, nome, idade,endereco, salario);
	}
	
	public Atendimento(float hrExtraAtend, float comissao, float desAtend) {
		
	}
	
	public Atendimento() {
		
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.hrExtraAtend);
		sb.append(";");
		sb.append(this.comissao);
		sb.append(";");
		sb.append(this.descAtend);
		
		return sb.toString();
	}
	
	@Override
	public float calcularSalario() {
		float salarioBruto;
		
		salarioBruto = getSalario() + hrExtraAtend + comissao - descAtend;
		
		return salarioBruto;
	}

	public float getHrExtraAtend() {
		return hrExtraAtend;
	}

	public void setHrExtraAtend(float hrExtraAtend) {
		this.hrExtraAtend = hrExtraAtend;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float getDescAtend() {
		return descAtend;
	}

	public void setDescAtend(float descAtend) {
		this.descAtend = descAtend;
	}	
}
