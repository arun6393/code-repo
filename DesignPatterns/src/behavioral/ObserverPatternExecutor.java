package behavioral;

public class ObserverPatternExecutor {
	
	
	
	public static void main(String args[]) {
	
		StockObservable observable=new IphoneStockObservable();
		
		
		NotificationService notificationService=new EmailNotificationService(observable);
		
		
		observable.addObserver(notificationService);
		
		observable.setData(10);
		
		
		
	}

}
