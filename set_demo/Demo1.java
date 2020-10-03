package set_demo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Dd");
		hashSet.add("Dd");
		hashSet.add(null);
		hashSet.add("");
		hashSet.add("");
		hashSet.add("apple");
		hashSet.add("ball");
		System.out.println(hashSet);
		
		Set<String> linkedhashSet = new LinkedHashSet<>();
		linkedhashSet.add("Dd");
		linkedhashSet.add("Dd");
		linkedhashSet.add(null);
		linkedhashSet.add("");
		linkedhashSet.add("");
		linkedhashSet.add("apple");
		System.out.println(linkedhashSet);
		
		//How empty string will work on treeset for comparing two elements ?
		//TreeSet sorting the elements based on ASCII Value ?
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Dd");
		treeSet.add("Dd");
		treeSet.add("");
		treeSet.add("");
		treeSet.add("apple");
		treeSet.add("ball");
		treeSet.add("All");
		System.out.println(treeSet);
		
		//With the help of collections helper class, we can keep that in reverse order
		Set<String> treeSet1 = new TreeSet<>(Collections.reverseOrder());
		treeSet1.add("Dd");
		treeSet1.add("Dd");
		treeSet1.add("");
		treeSet1.add("");
		treeSet1.add("apple");
		treeSet1.add("ball");
		treeSet1.add("All");
		System.out.println(treeSet1);

		//To iterate the unindexed set use for each loop
		for(String s : treeSet1) {
			System.out.print(s + ",");
		}
		
		//Search
		System.out.println(treeSet1.contains("apple"));
		
		
		

	}

}
