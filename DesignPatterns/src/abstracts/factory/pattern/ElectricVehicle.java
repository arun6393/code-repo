package abstracts.factory.pattern;

public abstract class ElectricVehicle implements Vehicle{

	private final CarBodyType type;
	
	public ElectricVehicle(final CarBodyType type) {
		this.type=type;
	}
	
	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		
	}
}
