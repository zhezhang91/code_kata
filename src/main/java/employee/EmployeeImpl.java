package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmployeeImpl {
	
	static ArrayList<Employee> employees;	
	public static void main(String[] args) {
		
		employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Max", 17));
		employees.add(new Employee("Sepp", 18));
		employees.add(new Employee("Nina", 15));
		employees.add(new Employee("Mike", 51));
		System.out.println(employees);

		
	   filterEmployee(employees);
		
		
		
	}
	
	public static void decendingNames(ArrayList<Employee> filteredEmployees) {
		String[] EmployeesName = new String[filteredEmployees.size()];
		   for(int i=0; i < employees.size(); i++) {
			   EmployeesName[i] = filteredEmployees.get(i).getName();
		   };
		   
		   Arrays.sort(EmployeesName, Collections.reverseOrder());
		   for(int i=0; i < EmployeesName.length; i++) {
			   System.out.println(EmployeesName[i]);
		   };
		
	} 
	
	public static ArrayList<Employee> filterEmployee(ArrayList<Employee> employees) {
		ArrayList<Employee> filteredEmployees = new ArrayList<Employee>();
		   for(int i=0; i < employees.size(); i++) {
			   if (employees.get(i).getAge() > 18) {
				   filteredEmployees.add(employees.get(i));
			   }	   
			   
		   };
		   System.out.println(filteredEmployees);
		   decendingNames(employees);

		   return filteredEmployees;

	}
	
	
	public static void printArray(ArrayList<Employee> employees) {
		   for(int i=0; i < employees.size(); i++) {
			   
				   employees.get(i).getName();
			   }	 
		   

		   

	}
	

}
