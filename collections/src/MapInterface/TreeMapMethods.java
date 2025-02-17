package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethods {
	public static void main(String[] args) {
		// clear,compute,computeIfAbsent,computeIfPresent
		// containsKey,conatainsValue,entrySet,equals,forEach
		// get,getOrDefault,hashcode,isEmpty,KeySet,Merge,put,putAll
		// putIfAbsent,remove,replace,replaceAll,size,toString,values
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(18, "Virat");
		tm.put(10, "Sachin");
		tm.put(7, "Dhoni");
		tm.put(45, "Rohith");
		tm.put(3, null);
		tm.put(88, null);// multiple null values is accepted
		// tm.put(null, "jos"); // null key value is not accepted
		tm.put(1, "Rahul");
		tm.put(1, "Rahul");// duplicate values are not accepted
		tm.put(17, "Pant");
		tm.put(17, "tejjj");
		// it will replace/override the 17 key value of pant with tejjj
		tm.put(8, "jadeja");
		System.out.println(tm);
		// Order of insertion is maintained and sorted in ascending order
		System.out.println(tm.get(17));
		System.out.println(tm.getOrDefault(12, "cherry"));
		// if the key is present it returns else it return the default value
		System.out.println(tm.containsKey(8));
		System.out.println(tm.containsValue("Virat"));
		System.out.println(tm.isEmpty());
		System.out.println(tm);
		tm.remove(45);
		System.out.println(tm);
		tm.remove(1, "Rahul");
		System.out.println(tm);
		System.out.println(tm.size());
		System.out.println("-------------------");
		System.out.println("Entry Set :" + tm.entrySet());
		System.out.println("KeySet :" + tm.keySet());
		System.out.println("Values :" + tm.values());
		System.out.println("--------------------");
		tm.putIfAbsent(18, "virat");// 18key is present so it is not inserted
		System.out.println(tm);
		tm.putIfAbsent(26, "Virat");// 26 key is not present so inserted in map
		System.out.println(tm);
		System.out.println("--------------------");
		tm.replace(8, "teja");
		System.out.println(tm);// replace the value with specific key
		System.out.println(tm.replace(26, "Virat", "charanTeja"));
		System.out.println(tm);
		System.out.println("---------------------");
		
	}
}
