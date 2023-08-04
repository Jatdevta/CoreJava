package collectionFramework;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	private int salary;
	
	public Employee(int id,int salary,String name) {
		this.id= id;
		this.name=name;
		this.salary=salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return id+" "+ name +" "+ salary;
	}
	@Override
	public int compareTo(Employee o) {
		if (this.id - o.id == 0) {
			return this.name.compareTo(o.name);
		}
		return this.id - o.id;
}		
}


class orderById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	//	return o1.getId()-o2.getId();
		return o2.getId()-o1.getId();
	}
}

class orderByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		//return o2.getName().compareTo(o1.getName());
		return o1.getName().compareTo(o2.getName());
		
	}
}

class orderBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary()-o2.getSalary();
		//return o2.getSalary()-o1.getSalary();
	}
}