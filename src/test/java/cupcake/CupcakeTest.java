package cupcake;

import java.util.ArrayList;
import java.util.List;



public class CupcakeTest {
	private int count;
	private static Object object;
	public void addCounts1(Object object) {
		if(object != null) {count++;}
		else return;
	}
//	private CupcakeToppingDecorator cupcakeToppingDecorator;
	// name this be different functions and test for each case
	// use decoration without overide the getName
    public static void main(String[] args ) {
    	
    	Topings cake = new Peanuts(new Peanuts(new Chocolate(new Cupcake())));
    	
    	List<String> toppings = new ArrayList<String>();
         object = cake;
         if(object != null) {  toppings.add(((Topings) object).getName()); 	  System.out.println(object);}
    	
    	int i = 0;
    	do {
    	  System.out.println(i);
    	  i++;
    	  object = ((Topings) object).getObject();
    	  if(object != null) {   	  toppings.add(((Topings) object).getName());System.out.println(object);}
 
    	}
    	while (object != null);
    	System.out.println(toppings);

    }
	private static void addCounts(Object object2) {
		// TODO Auto-generated method stub
		
	}
}
 