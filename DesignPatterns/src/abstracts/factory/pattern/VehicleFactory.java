package abstracts.factory.pattern;

public class VehicleFactory {

	
	public static Vehicle getInstance(final CarBodyType carBodyType,final EnergyType energyType) {
		
		switch(energyType) {
		
		case ELECTRIC:
			return ElectricVehicleFactory.getInstance(carBodyType);
		default:
			throw new UnsupportedOperationException();
		}
		
	}
	
}
