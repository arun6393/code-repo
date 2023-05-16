package creational;

public class MacFactory implements UIFactory{

	@Override
	public Button getButton() {
		return new MACButton();
	}

	
}
