package observer;
import java.util.ArrayList;
public class PlanilhaSubject implements Subject {
	private int[] vetor = {3, 6, 9};
	private ArrayList<Observer> observadores;
	public PlanilhaSubject() { 
		observadores = new ArrayList<Observer>();
	}
	@Override
	public void add(Observer o) {
		observadores.add( o );
	}
	@Override
	public void remove(Observer o) {
		observadores.remove( o );
	}
	@Override
	public void notifyObserver() {
		for (Observer o : observadores) { 
			o.update(  vetor  );
		}
	}
	public void setValor( int celula, int valor) { 
		vetor[celula] = valor;
		notifyObserver();
	}
}
