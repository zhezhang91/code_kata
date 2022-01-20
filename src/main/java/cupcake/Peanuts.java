package cupcake;

public class Peanuts implements Topings {

	Object object;
	public Peanuts(Object object) {
		this.object = object;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Peanuts";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0.2;
	}
	
	@Override
	public Object getObject() {
		return object;
	}

}