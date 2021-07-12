package br.edu.infnet.appgestao.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FolhaPagamento {
	
	private LocalDateTime data;
	private boolean planoSaude;
	private boolean valeAlimentacao;
	
	public FolhaPagamento(LocalDateTime data) {
		data = LocalDateTime.now();
	}
	
	public FolhaPagamento(boolean planoSaude, boolean valeAlimentacao) {

	}
	
	public FolhaPagamento(){
		
	}
	
	public String gerarData() {
		return String.format("Pagamento realizado em %s.", 
					this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))
				);
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		return String.format("%s;%b;%b", 
				this.data.format(formato), 
				this.planoSaude,
				this.valeAlimentacao
			);
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}

	public boolean isValeAlimentacao() {
		return valeAlimentacao;
	}

	public void setValeAlimentacao(boolean valeAlimentacao) {
		this.valeAlimentacao = valeAlimentacao;
	}
}
