package cupcake;

public class CupcakeToppingDecorator extends ToppingDecorator {
  public CupcakeToppingDecorator(Topings topingDecorator) {
	  super(topingDecorator);
  }
  
  @Override
  public String getName() {
	  return topings.getName();	       
     
  }
  
  @Override
  public double getPrice() {
	  return topings.getPrice();	       
  }
}
