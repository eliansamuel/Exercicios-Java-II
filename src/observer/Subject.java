package observer;

public interface Subject extends Observer{
	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver();
	
}
