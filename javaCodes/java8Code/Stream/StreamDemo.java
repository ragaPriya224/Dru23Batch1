package practiccising.main.java8Code.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> cityList = 
				Arrays.asList("chennai", "mumbai", "bangalore","","canada", "delhi", "chicago");

		//		i) convert the  all the cities to uppercase

		for(int i=0;i<cityList.size();i++){
			//			System.out.println(cityList.get(i).toUpperCase());
		}

		List<String> outputList = cityList.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
		System.out.println(outputList);

		List<String> resultList = cityList.stream().filter(a -> a.length()>6).collect(Collectors.toList());
		//SORT THE CITIES
		List<String> output = cityList.stream().sorted().collect(Collectors.toList());
		System.out.println(output);
		System.out.println("cityList: " +cityList);
		//find cities start with c
//	List<String> cCity = cityList.stream().filter(a -> a.startsWith("c")).skip(1).collect(Collectors.toList());
	System.out.println(cCity);
	System.out.println(" ************************");
	List<String> limitCity = cityList.stream().limit(3).collect(Collectors.toList());
System.out.println(limitCity);
long number = cityList.stream().filter(a -> a.startsWith("c")).count();

	}

}
