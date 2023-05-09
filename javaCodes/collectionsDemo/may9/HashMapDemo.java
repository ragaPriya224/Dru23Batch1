package practiccising.main.collectionsDemo.may9;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap cityMap = new HashMap<>();
		cityMap.put(22, "hyderabad");
//		key - > 22
//		value -> hyderbad
	
		cityMap.put(31, "delhi");
		cityMap.put(22, "secunderabad");
		System.out.println(cityMap);
		System.out.println(cityMap.keySet());
		System.out.println(cityMap.values());
		System.out.println(cityMap.containsKey(101));
		System.out.println(cityMap.containsValue("chennai"));//false
		System.out.println(cityMap.size());
		System.out.println(cityMap.entrySet());
		//isempty, clear, remove,replace
//		System.out.println(cityMap.);
		cityMap.putIfAbsent(111, "mumbai");
		System.out.println(cityMap);
	}

}
