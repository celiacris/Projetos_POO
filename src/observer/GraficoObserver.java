package observer;

public class GraficoObserver implements Observer {
	
	private String barra;
	public GraficoObserver( String b ) { 
		barra = b;
	}

	@Override
	public void update(int[] v) {
		int soma = 0;
		System.out.println("Observer Gráfico");
		for (int valor : v) { 
			System.out.print("[" + valor + "]  ");
			for (int i=0; i < valor; i++) { 
				System.out.print( barra );
			}
			System.out.println();
			soma += valor;
		}
		System.out.println("(Soma) : " + soma + "\n");
	}

}
