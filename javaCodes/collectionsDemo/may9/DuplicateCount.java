package practiccising.main.collectionsDemo.may9;

import java.util.LinkedHashMap;

public class DuplicateCount {

	public static void main(String[] args) {
		String name = "ragapriya";
//		r -> 2
//		a -> 3
//		g, p,y -> 1
//		r 2
//		a 3 // +1
//		g 1
//		p 1
//		i 1
//		y 1
//		key -> characters 
//		value -> count
		char[] nameArray = name.toCharArray();
		LinkedHashMap<Character,Integer> dataMap = new LinkedHashMap<Character,Integer>();
		for(int i = 0; i < nameArray.length-1;i++) {
			//check already present
			if(dataMap.containsKey(nameArray[i])) {
				//if already present -> inc the count
				dataMap.put(nameArray[i],dataMap.get(nameArray[i])+1);
			}else {
				//not prsent -> had the count as 1
				dataMap.put(nameArray[i],1);
			}
			
		}
		System.out.println(dataMap);

		
		

	}

}
