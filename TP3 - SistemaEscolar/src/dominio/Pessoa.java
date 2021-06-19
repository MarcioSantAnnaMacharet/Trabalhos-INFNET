package dominio;

import exceptions.IdadeInvalidaException;
import exceptions.NomeInvalidoException;

public abstract class Pessoa {
	
	private static String nome;
	private static String sobrenome;
	private static String ultimoNome;
	private static int idade;
	
	public Pessoa() {
		nome = "fantasma";
		idade = 18;
	}
	
	public Pessoa(String nome) {
		idade = 25;
	}
	
	public static StringBuilder ObterNome() throws NomeInvalidoException {

		if( nome == null ||sobrenome == null || ultimoNome == null) {
			throw new NomeInvalidoException("Nome inválido");
		}
		
		StringBuilder subs = new StringBuilder();
		
		subs.append(nome.toUpperCase());
		subs.append(".");
		subs.append(sobrenome.toUpperCase().charAt(0));
		subs.append(".");
		subs.append(ultimoNome.toUpperCase());

		return subs;
	}
	
	public static int age () throws IdadeInvalidaException {

		if(idade > 100) {
			throw new IdadeInvalidaException("idade inválida");
		}
		return idade;
	}
	
	public static String getSobrenome() {
		return sobrenome;
	}

	public static void setSobrenome(String sobrenome) {
		Pessoa.sobrenome = sobrenome;
	}

	public static String getUltimoNome() {
		return ultimoNome;
	}

	public static void setUltimoNome(String ultimoNome) {
		Pessoa.ultimoNome = ultimoNome;
	}

	public abstract void imprimir();
	
	public String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public static void setIdade(int idade) {
		Pessoa.idade = idade;
	}
}
	
	