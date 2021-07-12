package br.edu.infnet.appgestao.model.domain;

public class Cozinha extends Funcionario {
	
	private float hrExtraCozinha;
	private float adcPericulosidade;
	private float descCozinha;
	
	public Cozinha(String tipo, String nome, int idade, String endereco, float salario) {
		super(tipo, nome, idade,endereco, salario);
	}
	
	public Cozinha(float hrExtraCozinha, float adcPericulosidade, float descCozinha) {
		
	}
	
	public Cozinha() {
		
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.hrExtraCozinha);
		sb.append(";");
		sb.append(this.adcPericulosidade);
		sb.append(";");
		sb.append(this.descCozinha);
		
		return sb.toString();
	}
	
	@Override
	public float calcularSalario() {
		float salarioBruto;
				
		salarioBruto = getSalario() + hrExtraCozinha + adcPericulosidade - descCozinha;
				
		return salarioBruto;
	}

	public float getHrExtraCozinha() {
		return hrExtraCozinha;
	}

	public void setHrExtraCozinha(float hrExtraCozinha) {
		this.hrExtraCozinha = hrExtraCozinha;
	}

	public float getAdcPericulosidade() {
		return adcPericulosidade;
	}

	public void setAdcPericulosidade(float adcPericulosidade) {
		this.adcPericulosidade = adcPericulosidade;
	}

	public float getDescCozinha() {
		return descCozinha;
	}

	public void setDescCozinha(float descCozinha) {
		this.descCozinha = descCozinha;
	}
	
}
