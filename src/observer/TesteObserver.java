package observer;

public class TesteObserver {
	public static void main(String[] args) {
		
		ConcrectSubject concretSubject = new  ConcrectSubject();
		
		DivObserver divObserver = new DivObserver(concretSubject);
		
		ModObserver modObserver = new ModObserver(concretSubject);
		
		concretSubject.ValorChanged(100);
		concretSubject.ValorChanged(37);
		concretSubject.ValorChanged(92);
		concretSubject.ValorChanged(10);
	}

}
