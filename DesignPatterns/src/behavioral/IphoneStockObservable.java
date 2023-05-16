package behavioral;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

	
	List<NotificationService> services=new ArrayList<>();
	int count;
	
	@Override
	public void addObserver(NotificationService po) {
		services.add(po);
		
	}

	@Override
	public void removeObserver(NotificationService po) {
		services.remove(po);
		
	}

	@Override
	public void setData(int count) {
		this.count=this.count+count;
		if(this.count>0) {
			notifyObserver();
		}
		
		
	}

	@Override
	public int getData() {
		
		return this.count;
	}

	@Override
	public void notifyObserver() {
		for(NotificationService service: services) {
			service.update();
		}
		
	}

}
