package abstracts.factory.pattern;

public class ElectricVehicleFactory {

	
	public static Vehicle getInstance(final CarBodyType type) {
		
		switch(type) {
		
		case SUV:
			return new SUVElectric();
		default:
			throw new UnsupportedOperationException();
		}
		
	}
	
}
