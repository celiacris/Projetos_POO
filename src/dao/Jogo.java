package dao;

import java.util.Date;

public class Jogo {

	private Long id;
	private String nome;
	private Date lancamento;
	
	
	public Long getId() {
		return id;
	}
	public void setId(int i) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getLancamento() {
		return lancamento;
	}
	public void setLancamento(Date lancamento) {
		this.lancamento = lancamento;
	}
	
	
	
}
