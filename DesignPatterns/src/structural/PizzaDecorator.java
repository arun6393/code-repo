package structural;

public abstract class PizzaDecorator implements BasePizza{

	private BasePizza basePizza;
	
	public PizzaDecorator(BasePizza basePizza) {
		this.basePizza=basePizza;
	}
	
	@Override
	public void cost() {
		basePizza.cost();
	}

	
}
