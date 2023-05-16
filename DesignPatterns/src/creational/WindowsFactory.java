package creational;

public class WindowsFactory implements UIFactory{

	@Override
	public Button getButton() {
		return new WindowsButton();
	}

	
	
}
