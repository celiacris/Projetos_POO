package dao;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {

		DAOJogo dao = new DAOJogoImp1();
		
		Jogo jogo = new Jogo();
		jogo.setId(1);
		jogo.setNome("The Legend of Zelda");
		jogo.setLancamento(new Date());
		
		dao.Adicionar(jogo);
		System.out.println("Executado com sucesso");
	}

}
