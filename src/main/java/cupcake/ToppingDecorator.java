package cupcake;

public abstract class ToppingDecorator implements Topings {

	protected Topings topings;
	
	public ToppingDecorator(Object object) {
		this.topings = (Topings) object;
	}
	
//	public ToppingDecorator(Object object) {
//		// TODO Auto-generated constructor stub
//	}

	public String getName() {
		return topings.getName();
	}
	
	public double getPrice() {
		return topings.getPrice();
	}
}
