package practiccising.main.java8Code.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = 
				Arrays.asList("prasanna","paris","praveen","Eswar");
		Optional<String> output = cityList.stream().filter(name -> name.startsWith("p")).findFirst();
		Optional<String> result = cityList.stream().filter(name -> name.startsWith("p")).findAny();
System.out.println(result.get());
	}

}
