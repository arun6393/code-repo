package abstracts.factory.pattern;

public abstract class GasVehicle implements Vehicle{

	private final CarBodyType type;
	
	public GasVehicle(final CarBodyType type) {
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
