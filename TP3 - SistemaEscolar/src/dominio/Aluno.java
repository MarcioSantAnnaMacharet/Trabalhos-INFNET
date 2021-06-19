package dominio;

import exceptions.NotaInvalidaException;

public class Aluno extends Pessoa {
	
	private static float av1;
	private static float av2;
	
	public Aluno() {
		
		Pessoa.setNome("aluno");
		Pessoa.setIdade(18);
		av1 = 0;
		av2 = 0;
	}
	
	public Aluno(String SetNome, int SetIDade ) {
		av1 = 10;
		av2 = 10;
	}
	
	public Aluno(float av1, float av2) {
		Pessoa.setNome(getNome());
		Pessoa.setIdade(getIdade());
	}

	@Override
	public void imprimir() {
		
		float media = calcularMedia(0);
		
		System.out.printf("%s %s %s - %d - %.2f - %.2f - \n", 
				getNome(),
				getSobrenome(),
				getUltimoNome(),
				getIdade(), 
				av2,
				av1
				);
		
		System.out.println("A média é: " + media );
		System.out.println("A situação é: " + getSituacao(media));
	}
	
	public static float calcularMedia(int m) {
		return (av1 + av2) / 2;		
	}
	
	public static String getSituacao(float calcularMedia) {
		if(calcularMedia < 4) {
			return "Reprovado";
		} else if(calcularMedia > 7) {
			return "Aprovado";
		} else {
			return "Prova Final";
		}
	}

	public static float notaAv1 () throws NotaInvalidaException {

		if(av1 > 10) {
			throw new NotaInvalidaException("Nota inválida");
		}
		return av1;
	}
	
	public static float notaAv2 () throws NotaInvalidaException {

		if(av2 > 10) {
			throw new NotaInvalidaException("Nota inválida");
		}
		return av2;
		}
	
	public static float getAv1() {
		return av1;
	}

	public void setAv1(float av1)throws NotaInvalidaException {
		Aluno.av1 = av1;
	}

	public static float getAv2() {
		return av2;
	}

	public void setAv2(float av2) throws NotaInvalidaException {
		Aluno.av2 = av2;
	}

}
