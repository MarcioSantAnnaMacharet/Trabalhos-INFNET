package br.edu.infnet.appgestao.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.appgestao.model.exceptions.EnderecoInvalidoException;
import br.edu.infnet.appgestao.model.exceptions.IdadeInvalidaException;
import br.edu.infnet.appgestao.model.exceptions.NomeInvalidoException;


import br.edu.infnet.appgestao.model.domain.Atendimento;
import br.edu.infnet.appgestao.model.domain.Cozinha;
import br.edu.infnet.appgestao.model.domain.Empresa;
import br.edu.infnet.appgestao.model.domain.FolhaPagamento;
import br.edu.infnet.appgestao.model.domain.Gerente;
import br.edu.infnet.appgestao.model.domain.Funcionario;

public class AppGestaoTeste {

	public static void main(String[] args) {
	
		try {
			String dir = "c:/dev/";
			String arq = "folhaPagamento.txt";
	
			try {
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
					String[] campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					
					case "0":
						
					//	FolhaPagamento f1 = new FolhaPagamento();
					//	escrita.write(f1.gerarData() + "\r\n");
						
						Empresa empresa1 = new Empresa();
						empresa1.setNomeEmp(campos[1]);
						empresa1.setCNPJ(Integer.valueOf(campos[2]));
						empresa1.setEmail(campos[3]);
	
						empresa1.imprimir();
						escrita.write(empresa1.dadosEmp() + "\r\n");
						
						break;
					
					case "G":
						
						Gerente gerente1 = new Gerente();
						gerente1.setTipoFuncionario(campos[0]);
						gerente1.setNome(campos[1]);
						gerente1.setEndereco(campos[2]);
						gerente1.setIdade(Integer.valueOf(campos[3]));
						gerente1.setSalario(Float.valueOf(campos[4]));
						gerente1.setAdcResp(Float.valueOf(campos[5]));
						gerente1.setAdcDisp(Float.valueOf(campos[6]));
						gerente1.setAdcGratificacao(Float.valueOf(campos[7]));
	
						gerente1.imprimir();
						escrita.write(gerente1.dadosFuncionario() + "\r\n");
						
						break;
						
					case "C":
						
						Cozinha cozinha1 = new Cozinha();
						cozinha1.setTipoFuncionario(campos[0]);
						cozinha1.setNome(campos[1]);
						cozinha1.setEndereco(campos[2]);
						cozinha1.setIdade(Integer.valueOf(campos[3]));
						cozinha1.setSalario(Float.valueOf(campos[4]));
						cozinha1.setHrExtraCozinha(Float.valueOf(campos[5]));
						cozinha1.setAdcPericulosidade(Float.valueOf(campos[6]));
						cozinha1.setDescCozinha(Float.valueOf(campos[7]));
	
						cozinha1.imprimir();
						escrita.write(cozinha1.dadosFuncionario() + "\r\n");
						
						break;
						
					case "A":
						
						Atendimento atendimento1 = new Atendimento();
						atendimento1.setTipoFuncionario(campos[0]);
						atendimento1.setNome(campos[1]);
						atendimento1.setEndereco(campos[2]);
						atendimento1.setIdade(Integer.valueOf(campos[3]));
						atendimento1.setSalario(Float.valueOf(campos[4]));
						atendimento1.setHrExtraAtend(Float.valueOf(campos[5]));
						atendimento1.setComissao(Float.valueOf(campos[6]));
						atendimento1.setDescAtend(Float.valueOf(campos[7]));
	
						atendimento1.imprimir();
						escrita.write(atendimento1.dadosFuncionario() + "\r\n");
						
						break;

					default:
						System.out.println("Inválido !");
						break;
					}

					linha = leitura.readLine();
				}
				
				file.close();
				leitura.close();
				escrita.close();
				fileW.close();

			} catch (NomeInvalidoException | IdadeInvalidaException | EnderecoInvalidoException | IOException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Finalizado.");
		}
	}
	
}
