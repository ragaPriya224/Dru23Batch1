package practiccising.main.java8Code.Stream;

import java.util.Arrays;
import java.util.List;

public class MatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = 
				Arrays.asList("prasanna","praveen","Eswar");
		boolean anyMatchOutput = cityList.stream().anyMatch(city -> Character.isUpperCase(city.charAt(0)));
	System.out.println("anyMatchOutput" + anyMatchOutput);//true
	boolean allMatchOutput = cityList.stream().allMatch(city -> Character.isUpperCase(city.charAt(0)));
	System.out.println("allMatchOutput" + allMatchOutput);//false
	boolean noneMatchOutput = cityList.stream().noneMatch(city -> Character.isUpperCase(city.charAt(0)));
	System.out.println("noneMatchOutput" + noneMatchOutput);//false
	}

}
