package practiccising.main.collectionsDemo.may9;

import java.util.HashMap;
import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		TreeSet<String> foodSet = new TreeSet<>();
		foodSet.add("biryani");
		foodSet.add("noodles");
//		foodSet.add(22);
		System.out.println(foodSet);//runtime exception
		
		String[] data = new String[100];
		data[1] = "briyani";
		data[2]= "noodles";
		data[3] = 22; //compiling exception
		
		HashMap<Integer,String> cityMap = new HashMap<>();
		cityMap.put(31, "delhi");
		cityMap.put(22, "secunderabad");
		cityMap.put("hi", "hello");
	}

}
