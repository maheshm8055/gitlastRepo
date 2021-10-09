package Streems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class StreemExample {
 
	public void show() {
		List<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		System.out.println(streamOfCollection);
		Stream<String> streamBuilder =
	 Stream.<String>builder().add("a").add("b").add("c").build(); 
		//otherwise the build() method will create an instance of the Stream<Object>:
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		
		
		//The generate() method accepts a Supplier<T> for element generation.
		//As the resulting stream is infinite, the developer should specify the desired size, or the generate() method will work until it reaches
		//the memory limit:
		
		/*
		 * Stream.iterate() Another way of creating an infinite stream is by using the
		 * iterate() method:
		 */
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
	
	
	
	}
	

	public static void main(String[] args) {
		HashMap al1 = new HashMap();
		al1.put("mahesh", "101");
		
		al1.put("ma", "102");
		al1.put("hesh", "103");
		al1.put("Mahesh", "104");
		
		Stream  emtysreem = Stream.empty();
		System.out.println(emtysreem);
		StreemExample ob = new StreemExample();
          ob.show();
	}

}
