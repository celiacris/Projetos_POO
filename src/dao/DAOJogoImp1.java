package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOJogoImp1 implements DAOJogo {

	@Override
	public void Adicionar(Jogo j) {
		try {
			Connection con = DatabaseConnection.getConnection();
			String sql ="UPDATE jogo SET nome = ?, "
					+ "lancamento = ?"
					+ "WHERE id = ?";
			PreparedStatement st = con.prepareStatement (sql);
			st.setLong(1, j.getId());
			st.setString(2, j.getNome());
			st.setDate(3, new java.sql.Date (j.getLancamento().getTime()));
			st.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void Atualizar(long id, Jogo j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remover(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Jogo> pesquisar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
