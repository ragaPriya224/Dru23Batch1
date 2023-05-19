package practiccising.main.java8Code.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {

		int[] markArray = {4,2,1,5};
		//		System.out.println(markArray[2]);

		//ARRAY streams creation
		long result = Arrays.stream(markArray).filter(a -> a%2 == 0 ).count();
		System.out.println(result);
		
		//Stream.of()
		 long output = Stream.of(4,2,1,5).filter(a -> a%2 == 0 ).count();
		 System.out.println(output);
		 
		 //from collection source
		 List<Integer> markList = Arrays.asList(4,2,1,5);
		 long number = markList.stream().filter(a -> a%2 == 0 ).count();
		 System.out.println(number);
		 System.out.println("{{{{{{{{{{{{{{{{{{{{");
		 
		 String a = "ljlkj";
		 //forEach
	 markList.stream()
				.filter(a -> a%2 == 0 )
				.forEach(System.out::println); //double colon operator
//		 System.out.println(outputList);
	 
		 //parallel stream and sequential stream
	 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
	 List<Integer> ageList = Arrays.asList(4,2,1,5);
	 ageList.stream()
	.forEach(age ->  System.out.println(age + Thread.currentThread().getName()));
	 System.out.println("((((((((((((((((((((((((");
	 ageList.parallelStream()
		.forEach(age ->  System.out.println(age + Thread.currentThread().getName()));
		
	 //tasks
	 
	 
	}
	//
	public List<String> search(List<String> list) {

		names3.stream().anyMatch(a->Character.isUpperCase(a.charAt(0)));
		return     
		}

}
