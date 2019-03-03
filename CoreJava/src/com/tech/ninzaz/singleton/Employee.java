package com.tech.ninzaz.singleton;

public class Employee {

	private int employeeID;
	private String name;
	
	//Note its static variable
	public static int countOfObjects;
	
	private Employee e1;
	
	private Employee(int emplyeeID, String name) throws Exception{
		countOfObjects++;
		if(countOfObjects > 5){
			throw new Exception("Can not create objects more than 5");
		}
		System.out.println(countOfObjects);
		this.employeeID = emplyeeID;
		this.name = name;
	}
	
	
	public Employee getObject() throws Exception{
		if(e1 == null){
			e1 = new Employee(1, "Lohith");
			return e1;
		}else{
			return e1;
		}
		
	}
	
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name
				+ ", countOfObjects=" + countOfObjects + "]";
	}
	
	
	
}
