package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
	public static void main(String[] args) {
		// clear,compute,computeIfAbsent,computeIfPresent
		// containsKey,conatainsValue,entrySet,equals,forEach
		// get,getOrDefault,hashcode,isEmpty,KeySet,Merge,put,putAll
		// putIfAbsent,remove,replace,replaceAll,size,toString,values
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(18, "Virat");
		hm.put(10, "Sachin");
		hm.put(7, "Dhoni");
		hm.put(45, "Rohith");
		hm.put(3, null);
		hm.put(88, null);// multiple null value is accepted
		hm.put(null, "jos");
		hm.put(null, "priya");
		// only one null key also accepted
		hm.put(1, "Rahul");
		hm.put(1, "Rahul");
		hm.put(17, "Pant");
		hm.put(17, "tejjj");
		// it will replace/override the 17 key value of pant with tejjj
		hm.put(8, "jadeja");
		System.out.println(hm);// Order of insertion is not maintained
		System.out.println(hm.get(17));
		System.out.println(hm.getOrDefault(12, "cherry"));
		// if the key is present it returns else it return the default value
		System.out.println(hm.containsKey(8));
		System.out.println(hm.containsValue("Virat"));
		System.out.println(hm.isEmpty());
		System.out.println(hm);
		hm.remove(45);
		System.out.println(hm);
		hm.remove(1, "Rahul");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println("-------------------");
		System.out.println("Entry Set :" + hm.entrySet());
		System.out.println("KeySet :" + hm.keySet());
		System.out.println("Values :" + hm.values());
		System.out.println("--------------------");
		hm.putIfAbsent(18, "virat");// 18key is present so it is not inserted
		System.out.println(hm);
		hm.putIfAbsent(26, "Virat");// 26 key is not present so inserted in map
		System.out.println(hm);
		System.out.println("--------------------");
		hm.replace(8, "teja");
		System.out.println(hm);// replace the value with specific key
		System.out.println(hm.replace(26, "Virat", "charanTeja"));
		System.out.println(hm);
		System.out.println("---------------------");
	}
}
