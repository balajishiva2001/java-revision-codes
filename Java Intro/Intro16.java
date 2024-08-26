
/*
 * Collection API -> concept
Collection -> Interface
Collections -> class with multiple methods
			    different type of data structures
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Stud implements Comparable<Stud>{
	String name;
	int age;

	public Stud() {
		super();
	}

	public Stud(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Stud o) {
		if(this.age > o.age) {
			return 1;
		}
		return -1;
	}

}

public class Intro16 {
	
	public static int charToInt(char c) {
		int v = c;
		return v;
	}
	
	public static void main(String[] args) {
		/*
		 * Collection
		 */
		System.out.println("Collection");
		Collection<String> collection = new ArrayList<String>(List.of("Test", "Best", "Quest"));
		collection.forEach(System.out::println);

		/*
		 * List-ArrayList
		 */
		System.out.println("List");
		List<Integer> integerList = new ArrayList<>();
		integerList.add(52);
		integerList.add(41);
		integerList.add(5);

		integerList.forEach(System.out::println);

		/*
		 * Set-HashSet
		 */
		System.out.println("Set");
		Set<Long> set = new HashSet<>(List.of(12l));
		set.add(1l);
		set.add(4l);
		set.add(65l);
		set.add(4l);
		set.add(54l);

		set.forEach(System.out::println);

		/*
		 * Using Iterator
		 */
		System.out.println("Iterator");
		Iterator<Long> values = set.iterator();

		while (values.hasNext()) {
			System.out.println(values.next());

		}

		/*
		 * Map
		 */
		System.out.println("Map");
		Map<String, String> m = new HashMap<>(Map.of("A", "AA", "B", "BB", "C", "CC"));
		m.put("D", "DD");
		m.put("E", "EE");
		for (Map.Entry<String, String> obj : m.entrySet()) {
			System.out.println("Key: " + obj.getKey() + " Value: " + obj.getValue());
		}
		
		System.out.println();
		for (String key : m.keySet()) {
			System.out.println("Key " + key + " Value " + m.get(key));
		}
		
		/*
		 * Using the Comparator
		 * descending order
		 */
		Comparator<Stud> com = (i, j) -> i.age > j.age ? -1 : 1;

		List<Stud> studList = new ArrayList<>(List.of(new Stud("A",10),new Stud("B",5),new Stud("C",15)));
		
		Collections.sort(studList, com);
		studList.forEach(System.out::println);
		
		/*
		 * Using Comparable
		 */
		System.out.println();
		List<Stud> newStudList = new ArrayList<>();
		newStudList.add(new Stud("X",25423));
		newStudList.add(new Stud("Y",423));
		newStudList.add(new Stud("Z",26723));
		
		Collections.sort(newStudList);
		newStudList.forEach(System.out::println);
		
		/*
		 * Using List and stream api
		 */
		System.out.println();
		List<Stud> studListStream = new ArrayList<>(List.of(new Stud("A",10),new Stud("B",5),new Stud("C",15)));
		studListStream.stream().sorted((i,j) -> i.age > j.age ? 1:-1).forEach(System.out::println);
	
		/*
		 * Using Stream to sum the values
		 */
		
		int sum = IntStream.range(1, 50).boxed().filter(i -> i%2==0 ).reduce(0, (a,b) -> a+b);
		System.out.println("Sum: " + sum);
		
		System.out.println("Fatctorial 5 : " + IntStream.rangeClosed(1, 5).reduce(1, (a,b)->a*b));
	
		System.out.println("Sum of doubles: "+ IntStream.rangeClosed(1, 5).reduce(0,  (i,j)-> i*2+j*2));
		
		 Map<String, Long> output = Arrays.stream("BestTest".split("")).toList().stream().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 output.entrySet().forEach(i -> System.out.println(i.getKey() +" : "+i.getValue()));
		
		 /*
		 * Using the defined Comparator @FuntionInterface
		 */
		 System.out.println("Sorted");
		 Comparator<Map.Entry<String, Long>> compMap= new Comparator<Map.Entry<String,Long>>() {
			
			List<String> vowels = List.of("a","e","i","o","u");
			
			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
				return o1.getValue() > o2.getValue() ? 1: -1;
			}
		};
		
		
		Consumer<Map.Entry<String, Long>> consumer= i -> System.out.println(i.getKey() +" : "+i.getValue());
		output.entrySet().stream().sorted(compMap).forEach(consumer);
		
		/*
		 *Streams 
		 */
		Stream<Integer> stream = Arrays.asList(10,15,87,3).stream();
		Optional<Integer> integer= stream.filter(i->i%3==0).findFirst();
		System.out.println(integer.get());
		
		/*
		 * Using Parallel Stream
		 */
		Stream<Integer> intStream = IntStream.rangeClosed(1, 5).boxed();
		System.out.println(intStream.parallel().reduce(0, (x,y)->x+y));
		
		/*
		 * Optional Class
		 */
		Optional<String> t= Arrays.asList("Na","K","P","T","S").stream().filter(i->i.length()>0).findFirst();
		System.out.println(t.get());
	
		/*
		 * Method Referance
		 */
		System.out.println();
		List<Integer> charToIntList = Arrays.asList("Best".split("")).stream().map(i -> i.charAt(0)).map(i-> charToInt(i)).toList();
		System.out.println(charToIntList);
		Function<Integer, String> func = new Function<Integer, String>() {
			
			@Override
			public String apply(Integer t) {
				int m = t;
				char ch = (char) m;
				return Character.toString(ch);
			}
		}; 
		
		System.out.println(charToIntList.stream().map(func).reduce("",(a,b)->a.concat(b)));
	
	}
	
	
}
