package observer;
import java.util.ArrayList;

public class ConcrectSubject implements Subject{
	
	private ArrayList observers;
	private int valor;

	
	public ConcrectSubject() {
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);	
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	@Override
	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this.valor);
		}
	}
	
	public int getValor() {
		return this.valor;
	}
	public void ValorChanged(int valor) {
		this.valor = valor;
		notifyObserver();
		}

	@Override
	public void update(int valor) {
	}

}
