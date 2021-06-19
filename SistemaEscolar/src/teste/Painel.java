package teste;

import java.util.Scanner;
import dominio.Pessoa;
import dominio.Professor;
import exceptions.NotaInvalidaException;
import exceptions.NomeInvalidoException;
import exceptions.IdadeInvalidaException;
import dominio.Aluno;

public class Painel {
	
	private static Pessoa[] user;
	
	private static int index;	

	private static final int QTDE = 5;
	
	public static void main(String[] args) throws NotaInvalidaException, IdadeInvalidaException, NomeInvalidoException{
		Scanner in = new Scanner(System.in);
		
		user = new Pessoa[QTDE];
		
		String opcao = null;
		
		int posicao = 0;
		
		do{
			System.out.println("[1] Cadastrar professor");
			System.out.println("[2] Cadastrar aluno");
			System.out.println("[3] Consultar a situação de um docente/discente");
			System.out.println("[4] Sair");
			
			System.out.print("Informe a opcao desejada: ");
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(index < QTDE) {
					
					Professor prof = new Professor();
					
					try {
						System.out.println("Informe o seu nome: ");
						prof.setNome(in.next());
						
						System.out.println("Informe o seu sobrenome: ");
						prof.setSobrenome(in.next());
						
						System.out.println("Informe o seu último: ");
						prof.setUltimoNome(in.next());
					
						System.out.println("Informe a sua idade: ");
						prof.setIdade(in.nextInt());
					
						System.out.println("Informe o seu salario: ");
						prof.setSalario(in.nextFloat());
				
						user[index] = prof;
						
						StringBuilder nomef = user[index].ObterNome();
						
						System.out.println("Professor cadastrado com sucesso: ");
						System.out.println(nomef);
						user[index].imprimir();
						
						
						System.out.println("Seu número de matricula é: " + index);
					
						index++;
					
					} catch(NomeInvalidoException i) { 
						System.out.println("Erro");
						}
					
					finally {
						System.out.println("Processamento concluído");
					}
					
				} else { 
						System.out.println("Não existe mais vaga para o cadastramento!!!");		
				}
				break;
				
			case "2":
				if (index < QTDE) {
					
					Aluno alun = new Aluno ();
					
					try {
						System.out.println("Informe o seu nome: ");
						alun.setNome(in.next());
						
						System.out.println("Informe o seu sobrenome: ");
						alun.setSobrenome(in.next());
						
						System.out.println("Informe o seu último: ");
						alun.setUltimoNome(in.next());
					
						System.out.println("Informe a sua idade: ");
						alun.setIdade(in.nextInt());
					
						System.out.println("Informe a nota da sua AV1: ");
						alun.setAv1(in.nextFloat());
						
						System.out.println("Informe a nota da sua AV2: ");
						alun.setAv2(in.nextFloat());
				
						
						user[index] = alun;
					
						StringBuilder nomef = user[index].ObterNome();
						
						System.out.println("Aluno cadastrado com sucesso: ");
						System.out.println(nomef);
						user[index].imprimir();
						System.out.println("Seu número de matricula é: " + index);
					
						index++;
						
					} catch(Exception i) { 
						System.out.println("Erro");
						}
					
					finally {
						System.out.println("Processamento concluído");
					}
					
					
				} else { 
					System.out.println("Não existe mais vaga para o cadastramento!!!");
				}
				break;
				
			case"3":
				
				System.out.print("Informe a posicao: ");
				posicao = in.nextInt();
				
				if(posicao >= 0 && posicao < index) {
					user[posicao].imprimir();
				} else {
					System.out.println("Usuário inexistente !!!");
				}
				break;
				
			default:
				System.out.println("Opcao invalida!!!");
				break; 
			}
			
		} while(!opcao.equals("4"));
	}
}	