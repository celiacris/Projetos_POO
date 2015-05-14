package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class JogoController implements TableModel {
	private List<Jogo> jogos = new ArrayList<Jogo>();
	
	public void salvar(Jogo j) { 
		jogos.add( j );
	}
	
	public Jogo pesquisar(String nome) { 
		for ( Jogo j : jogos ) { 
			if ( j.getNome().contains( nome ) ) { 
				return j;
			}
		}
		return null;
	}

	@Override
	public void addTableModelListener(TableModelListener arg0) {
	}

	@Override
	public Class<?> getColumnClass(int col) {
		Class<?>[] tipos = { String.class, Date.class };
		return tipos[ col ];
	}
	@Override
	public int getColumnCount() {
		return 2;
	}
	@Override
	public String getColumnName(int col) {
		String[] nomes = { "Nome", "Lançamento" };
		return nomes[ col ];
	}
	@Override
	public int getRowCount() {
		return jogos.size();
	}
	@Override
	public Object getValueAt(int lin, int col) {
		Jogo j = jogos.get( lin );
		Object[] valores = { j.getNome(), j.getLancamento() };
		return valores[ col ];
	}
	@Override
	public boolean isCellEditable(int lin, int col) {
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {	
	}

	@Override
	public void setValueAt(Object info, int lin, int col) {	
	}

}
