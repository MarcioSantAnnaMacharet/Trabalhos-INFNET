package br.edu.infnet.appgestao.model.domain;

public class Gerente extends Funcionario {

	private float adcDisp;
	private float adcResp;
	private float adcGratificacao;
	
	public Gerente(String tipo, String nome, int idade, String endereco, float salario) {
		super(tipo, nome, idade,endereco, salario);
	}
	
	public Gerente(float adcDisp, float adcResp, float adcGratificacao) {

	}
	
	public Gerente() {
		
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.adcDisp);
		sb.append(";");
		sb.append(this.adcResp);
		sb.append(";");
		sb.append(this.adcGratificacao);
		
		return sb.toString();
	}

	@Override
	public float calcularSalario() {
		float salarioBruto = 0;
		
		salarioBruto = getSalario() + adcDisp + adcResp + adcGratificacao;
		
		return salarioBruto;
	}
	
	public float getAdcDisp() {
		return adcDisp;
	}

	public void setAdcDisp(float adcDisp) {
		this.adcDisp = adcDisp;
	}

	public float getAdcResp() {
		return adcResp;
	}

	public void setAdcResp(float adcResp) {
		this.adcResp = adcResp;
	}

	public float getAdcGratificacao() {
		return adcGratificacao;
	}

	public void setAdcGratificacao(float adcGratificacao) {
		this.adcGratificacao = adcGratificacao;
	}
	
}
