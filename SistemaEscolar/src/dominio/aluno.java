package dominio;

public class aluno extends pessoa {
	
	private static float av1;
	private static float av2;
	
	public aluno() {
		av1 = 00;
		av2 = 00;
		
	}

	@Override
	public static void imprimir() {
		System.out.printf(" %s - %d - %2.f - %2.f \n", 
				getNome(),
				getIdade(),
				av1,
				av2
			);

	}
	
	
	public float getAv1() {
		return av1;
	}

	public void setAv1(float av1) {
		this.av1 = av1;
	}

	public float getAv2() {
		return av2;
	}

	public void setAv2(float av2) {
		this.av2 = av2;
	}

	
}
