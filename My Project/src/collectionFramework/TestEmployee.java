package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List list = new ArrayList();
		
	list.add( new Employee(1, 1000, "Raj"));
	list.add(new Employee(2, 1500, "Rahul"));
	list.add(new Employee(3, 2000, "Pankaj "));
	list.add(new Employee(4, 2500, "Sachin "));
	list.add(new Employee(5,300 , "Shubham "));
	list.add(new Employee(1,2000,"Nikita"));
	list.add(new Employee(7, 4000, "Raj "));
	list.add(new Employee(3, 200, "RAM "));
	//Collections.sort(list);
	//System.out.println(list);
	//Collections.sort(list, new orderById());
	//Collections.sort(list,new orderByName());
Collections.sort(list,new  orderBySalary());
	
	Iterator it = list.listIterator();
	while (it.hasNext()) {
		Object object = (Object)it.next();
		System.out.println(object);
		
	}
	
	
	}

}
