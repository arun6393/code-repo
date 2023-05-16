package behavioral;

public interface StockObservable {
	
	
	void addObserver(NotificationService po);
	
	void removeObserver(NotificationService po);
	
	void setData(int count);
	
	int getData();
	
	void notifyObserver();

}
