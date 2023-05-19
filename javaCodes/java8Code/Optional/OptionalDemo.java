package practiccising.main.java8Code.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class OptionalDemo {

	public static void main(String[] args) {
		String[] city = new String[10];

		city[2] = "delhi";

		//ofNullable 
		Optional<String> checkNull = Optional.ofNullable(city[2]);
		//		ofNullable -> value na, Value. else, empty
		//isPresent
		if(checkNull.isPresent()) {
			System.out.println(city[2].toLowerCase());
		}

		Optional<String> a = Optional.of(city[2]);
		System.out.println(a);
		//get
		System.out.println(a.get()); //delhi
		System.out.println("******");
		String[] food = new String[10];


//		Optional<String> result = Optional.of(food[2]);
//		System.out.println(result);
		System.out.println("@@@@@@@@@");
		List<String> cityList = new ArrayList<>();
		
//		Optional<String> output = cityList.stream()
//				.filter(name -> name.startsWith("p"))
//				.findFirst();
//		System.out.println(output);
		
		System.out.println("!!!!!");
		List<String> outputList = cityList.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
System.out.println(outputList);
	}

}
