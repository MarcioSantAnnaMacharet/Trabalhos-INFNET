package br.edu.infnet.appgestao.model.domain;

public class Empresa {

	private String nomeEmp;
	private int CNPJ;
	private String email;
	
	public Empresa(String nomeEmp, int CNPJ, String email){
		this.nomeEmp = nomeEmp;
		this.CNPJ = CNPJ;
		this.email = email;
	}
	
	public Empresa() {
		
	}
	
	public String dadosEmp() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nomeEmp);
		sb.append(";");
		sb.append(this.CNPJ);
		sb.append(";");
		sb.append(this.email);
		sb.append(";");
		
		return sb.toString();
	}
	
	public void imprimir() {
		System.out.printf("%s - %d - %s - \n", 
				nomeEmp,
				CNPJ, 
				email
			);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nomeEmp);
		sb.append(";");
		sb.append(this.CNPJ);
		sb.append(";");
		sb.append(this.email);

		return sb.toString();
	}

	public String getNomeEmp() {
		return nomeEmp;
	}

	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
