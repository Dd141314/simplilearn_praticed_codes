package map_demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> hashMap = new HashMap<Integer, String>();
		//Put method will work as both add and update
		hashMap.put(1, "Dd");
		hashMap.put(1, "Dd boy");
		hashMap.put(null,"Dd null");
		hashMap.put(null,"Dd seconsd null");
		hashMap.put(123, "Raj");
		hashMap.put(456,"Ramesh");
		hashMap.put(133, "null");
		hashMap.put(145,"null");
		System.out.println("************** HashMap **************");
		System.out.println(hashMap);
		
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Dd");
		linkedHashMap.put(1, "Dd boy");
		linkedHashMap.put(null,"Dd null");
		linkedHashMap.put(null,"Dd seconsd null");
		linkedHashMap.put(123, "Raj");
		linkedHashMap.put(456,"Ramesh");
		linkedHashMap.put(133, "null");
		linkedHashMap.put(0,"null");
		System.out.println("************** LinkedHashMap **************");
		System.out.println(linkedHashMap);
		
		Map<Integer,String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Dd");
		treeMap.put(1, "Dd boy");
		treeMap.put(123, "Raj");
		treeMap.put(456,"Ramesh");
		treeMap.put(133, "null");
		treeMap.put(0,"null");
		System.out.println("************** TreeMap **************");
		System.out.println(treeMap);
		
		Map<Integer,String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "Dd");
		hashTable.put(1, "Dd boy");
		hashTable.put(123, "Raj");
		hashTable.put(456,"Ramesh");
		hashTable.put(0,"null");
		System.out.println("************** HashTable **************");
		System.out.println(hashTable);
		
		//Get Method
		System.out.println("****Get HashTable Value****"+hashTable.get(1));
		
		//Contains Method
		System.out.println("****Contain HashTable Value****"+hashTable.containsKey(1));
		System.out.println("****Contain HashTable Value****"+hashTable.containsValue("Dd"));
		
		//Size Method
		System.out.println("****Size HashTable Value****"+hashTable.size());
		
		//Remove method
		String removedValue = hashTable.remove(1);
		System.out.println("****Removed HashTable Value****"+removedValue);
		
		//keySet Method
		System.out.println("****KeySet HashTable Value****"+hashTable.keySet());
		
		//valueSet Method
		System.out.println("****KeySet HashTable Value****"+hashTable.values());
		
		//Reading all key value pair
		System.out.println("*******Iterating Key Value Pair******");
		Set<Integer> set = hashTable.keySet();
		for(Integer i : set) {
			System.out.println("Key -> "+ i + " Value -> " + hashTable.get(i));
		}
		
		System.out.println("*******Iterating Key Value Pair using Entry set******");
		for(Entry<Integer, String> e : hashTable.entrySet()) {
			System.out.println("Key -> "+ e.getKey() + " Value -> " + e.getValue());
		}

		



		


		
				
	}

}
