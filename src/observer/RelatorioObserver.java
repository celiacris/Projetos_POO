package observer;

public class RelatorioObserver implements Observer {

	@Override
	public void update(int[] v) {
		int soma = 0;
		System.out.println("Observer Relatorio : ");
		for (int valor : v) { 
			System.out.print("[" + valor + "],  ");
			soma += valor;
		}
		System.out.println(" (Soma) : " + soma + "\n");
	}

}
