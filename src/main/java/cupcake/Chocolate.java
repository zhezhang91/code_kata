package cupcake;

public class Chocolate implements Topings {
	Object object;
	public Chocolate(Object object) {
		this.object = object;
	}
	
	
	@Override
	public Object getObject() {
		return object;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Chocolate";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0.1;
	}

}
