package br.edu.infnet.appgestao.model.domain;

import br.edu.infnet.appgestao.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appgestao.model.exceptions.EnderecoInvalidoException;
import br.edu.infnet.appgestao.model.exceptions.IdadeInvalidaException;

public abstract class Funcionario {
	
	private String nome;
	private String endereco;
	private int idade;
	private float salario;
	private String tipoFuncionario;
	
	public Funcionario(String tipo, String nome, int idade, String endereco, float salario) {
		this.tipoFuncionario = tipo;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.salario = salario;
	}
	
	public Funcionario() {
		
	}	
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.tipoFuncionario);
		sb.append(";");
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.endereco);
		sb.append(";");
		sb.append(this.idade);
		sb.append(";");
		sb.append(this.salario);
		
		return sb.toString();
	}
	
	public abstract float calcularSalario();
	
	public void imprimir() {
		System.out.printf("%s - %s - %d - %s\n", 
				tipoFuncionario,
				nome, 
				idade,
				endereco
			);
	}
	
	public String dadosFuncionario() throws NomeInvalidoException, IdadeInvalidaException, EnderecoInvalidoException {
		
		if(this.nome == null) {
			throw new NomeInvalidoException("Nome inexistente !");
		}
		
		if(this.idade > 100) {
			throw new IdadeInvalidaException("Idade Inválida !");
		}
		
		if(this.endereco == null) {
			throw new EnderecoInvalidoException("Endereço Inválido !");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.tipoFuncionario);
		sb.append(";");
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.endereco);
		sb.append(";");
		sb.append(this.idade);
		sb.append(";");
		sb.append(this.calcularSalario());
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
}
