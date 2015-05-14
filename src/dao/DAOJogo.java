package dao;

import java.util.List;

public interface DAOJogo {
	
	public void Adicionar(Jogo j);
	public void Atualizar(long id, Jogo j);
	public void Remover( long id);
	public List<Jogo> pesquisar (String nome);
	
}
