package cupcake;

public abstract class ChocolateToppingDecorator implements Topings {

	protected Topings topings;
	
	public ChocolateToppingDecorator(Object object) {
		this.topings = (Topings) object;
	}
	
    @Override
	public String getName() {
		return "Chocolate";
	}
	
	public double getPrice() {
		return 0.1;
	}
}