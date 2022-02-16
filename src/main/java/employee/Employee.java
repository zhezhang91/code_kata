package employee;

public class Employee {
	private String name;
	private int age;
//	const employees = [
//	                   { name: 'Max', age: 17 },
//	                   { name: 'Sepp', age: 18 },
//	                   { name: 'Nina', age: 15 },
//	                   { name: 'Mike', age: 51 },
//	                 ];
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	

}
