package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add("Shaktiman");
		list.add("AbraKaDabra");
		list.add("ShakalakaBoomBoom");
		list.add("SonPari");
		list.add("Hatim");
		list.add("Ben10");
		
		Collection Bhai = new ArrayList();
		Bhai.add("Rahul");
		Bhai.add("Pankaj");
		Bhai.add("Raj");
		
		Collection villain = new ArrayList();
		villain.add("Thanos");
		villain.add("Ravan");
		
		Collection Village =  new ArrayList();
		Village.add("Panchapura");
		Village.add("Gwali");
		Village.add("Jawar");
		
		list.addAll(list);
		list.addAll(Bhai);
		list.addAll(Village);
		list.addAll(villain);
		
	
		System.out.println(Bhai);
		System.out.println(villain);
		System.out.println(Village);
		System.out.println(list);
		
		
		
		
		
	}	
	}