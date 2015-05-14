package observer;

public class Aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PlanilhaSubject plan = new PlanilhaSubject();
		GraficoObserver graf = new GraficoObserver("#");
		RelatorioObserver rel = new RelatorioObserver();
		
		System.out.println("Registrando Observador no Subject ... ");
		plan.add( graf );
		plan.add( rel );
		
		System.out.println("Vetor sendo atualizado ... ");
		
		plan.setValor(0, 5);
		plan.setValor(1, 10);

	}

}
