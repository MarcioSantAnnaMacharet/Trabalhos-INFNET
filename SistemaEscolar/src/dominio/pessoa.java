package dominio;

public class pessoa {
	
	private static String nome;
	private static int idade;
	
	public pessoa() {
		nome = "fantasma";
		idade = 18;
	}
	
	public static void imprimir() {
		
		System.out.printf(" %s - %d \n", 
				nome, 
				idade
			);
	}
	
	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		pessoa.nome = nome;
	}

	public static int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		pessoa.idade = idade;
	}
	
	
}
	
	