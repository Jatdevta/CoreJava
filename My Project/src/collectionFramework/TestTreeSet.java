package collectionFramework;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("z");
		set.add("b");
		set.add("y");
		set.add("k");
		set.add("b");
		set.add("a");
		set.add("n");
		set.add("m");
		set.add("q");
		
		for (Object object : set);
			System.out.println(set.first());
			System.out.println(set.last());
			System.out.println(set.headSet("k"));
			System.out.println(set.tailSet("m"));
			System.out.println(set.subSet("d", "y"));
		}
	}


