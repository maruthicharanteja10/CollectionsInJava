package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInterfaceMethods {
	public static void main(String[] args) {
		// clear,compute,computeIfAbsent,computeIfPresent
		// containsKey,conatainsValue,entrySet,equals,forEach
		// get,getOrDefault,hashcode,isEmpty,KeySet,Merge,put,putAll
		// putIfAbsent,remove,replace,replaceAll,size,toString,values
		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(18, "Virat");
		lhm.put(10, "Sachin");
		lhm.put(7, "Dhoni");
		lhm.put(45, "Rohith");
		lhm.put(3, null);
		lhm.put(88, null);// multiple null value is accepted
		lhm.put(null, "jos");
		lhm.put(null, "priya");
		// only one null key also accepted
		lhm.put(1, "Rahul");
		lhm.put(1, "Rahul");// It wont allow duplicate values
		lhm.put(17, "Pant");
		lhm.put(17, "tejjj");
		// it will replace/override the 17 key value of pant with tejjj
		lhm.put(8, "jadeja");
		System.out.println(lhm);// Insertion order is maintained
		System.out.println(lhm.get(17));
		System.out.println(lhm.getOrDefault(12, "cherry"));
		// if the key is present it returns else it return the default value
		System.out.println(lhm.containsKey(8));
		System.out.println(lhm.containsValue("Virat"));
		System.out.println(lhm.isEmpty());
		System.out.println(lhm);
		lhm.remove(45);
		System.out.println(lhm);
		lhm.remove(1, "Rahul");
		System.out.println(lhm);
		System.out.println(lhm.size());
		System.out.println("-------------------");
		System.out.println("Entry Set :" + lhm.entrySet());
		System.out.println("KeySet :" + lhm.keySet());
		System.out.println("Values :" + lhm.values());
		System.out.println("--------------------");
		lhm.putIfAbsent(18, "virat");// 18key is present so it is not inserted
		System.out.println(lhm);
		lhm.putIfAbsent(26, "Virat");// 26 key is not present so inserted in map
		System.out.println(lhm);
		System.out.println("--------------------");
		lhm.replace(8, "teja");
		System.out.println(lhm);// replace the value with specific key
		System.out.println(lhm.replace(26, "Virat", "charanTeja"));
		System.out.println(lhm);
		System.out.println("---------------------");

	}
}
