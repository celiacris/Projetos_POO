package collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ControlDicionario {
	
	static Map<String, String> hash = new HashMap<String, String>();

	public static void main(String args[]) {

		TelaDicionario tela = new TelaDicionario();
		

		hash.put("Animal", new String("Fera"));
		hash.put("K2", new String("V2"));
		hash.put("K3", new String("V3"));
		hash.put("K4", new String("V4"));
		hash.put("K5", new String("V5"));

		

		/*if (hash.containsKey(Search)) {
			JOptionPane.showMessageDialog(null,"Palavra encontrada");
			System.out.println("Valor da Chave " + Search + " = "
					+ hash.get(Search));
		} else {
			System.err.println("Chave não existe");
		}*/
	}
	
	public void Validar() {
		
		TelaDicionario tela = new TelaDicionario();
		String Search = tela.keyToSearch;
		if (hash.containsKey(Search)) {
			JOptionPane.showMessageDialog(null,"Palavra encontrada");
			System.out.println("Valor da Chave " + Search + " = "
					+ hash.get(Search));
		} else {
			System.err.println("Chave não existe");
		}
		
	}

}