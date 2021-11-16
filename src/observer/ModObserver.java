package observer;

public class ModObserver implements Observer{
	
	private int valor;
	private Subject concretSubject;
	
	public ModObserver(Subject concretSubject) {
		this.concretSubject = concretSubject;
		concretSubject.registerObserver(this);
	}
	@Override
	public void update(int valor) {
		this.valor = valor % 5;
		System.out.println("Resto: " + this.valor);
	}

}
