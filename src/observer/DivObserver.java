package observer;

public class DivObserver implements Observer {
	
	private int valor;
	private Subject concretSubject;
	
	public DivObserver(Subject concretSubject) {
		this.concretSubject = concretSubject;
		concretSubject.registerObserver(this);
	}
	
	@Override
	public void update(int valor) {
		this.valor = valor / 5;
		System.out.println("Resultado: " + this.valor);
	}
}
