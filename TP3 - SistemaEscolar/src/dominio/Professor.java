package dominio;

public class Professor extends Pessoa {
	
	private static float salario;
			
	public Professor() {
		
		Pessoa.setNome("professor");
		Pessoa.setIdade(25);
		salario = 1000;
	}

	public Professor(String SetNome, int SetIdade) {
		salario = 2000;
	}
	
	@Override
	public void imprimir() {
		
		System.out.printf("%s %s %s - %d - R$%.2f \n", 
				getNome(), 
				getSobrenome(),
				getUltimoNome(),
				getIdade(),
				salario		
			);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		Professor.salario = salario;
	}
}	
