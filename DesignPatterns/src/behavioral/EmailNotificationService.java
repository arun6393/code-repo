package behavioral;

public class EmailNotificationService implements NotificationService{

	private StockObservable observable;
	
	
	public EmailNotificationService(StockObservable observable) {
		this.observable=observable;
	}
	
	@Override
	public void update() {
	System.out.println("Data count is "+observable.getData());
		
	}

	
	
	
}
