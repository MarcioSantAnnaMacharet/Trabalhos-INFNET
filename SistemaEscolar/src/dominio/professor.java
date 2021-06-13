package dominio;

public class professor extends pessoa {
		
	private static float salario;

	public professor() {
		salario = 00;
			
	}

	@Override
    public static void imprimir() {
		System.out.printf(" %s - %d - %2.f - %2.f \n", 
				getNome(),
				getIdade(),
				salario
				);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
