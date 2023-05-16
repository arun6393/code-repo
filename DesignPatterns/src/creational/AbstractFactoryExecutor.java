package creational;

public class AbstractFactoryExecutor {
	
	public static void main(String args[]) {
		
		UIFactory factory=OSAbstractFactory.getInstance("WINDOWS");
		Button button=factory.getButton();
		button.create();
	}

}
