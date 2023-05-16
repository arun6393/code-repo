package creational;

public class OSAbstractFactory {
	
	public static UIFactory getInstance(String osName) {
		
		
		switch (osName) {
		case "WINDOWS":
			return new WindowsFactory();
		case "MAC":
			return new MacFactory();
		default:
			throw new IllegalArgumentException("Unexpected value: " + osName);
		}
		
	}

}
