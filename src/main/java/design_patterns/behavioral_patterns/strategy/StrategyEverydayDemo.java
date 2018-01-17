package design_patterns.behavioral_patterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
	
	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}
	
	public static void main(String args[]) {
		Person bryan = new Person("Bryan", "801-555-1212", 39);
		Person mark = new Person("Mark", "801-444-1234", 41);
		Person chris = new Person("Chris", "801-222-5151", 38);
		
		List<Person> people = new ArrayList<>();
		people.add(bryan);
		people.add(mark);
		people.add(chris);
		
		System.out.println("Not sorted");
		printContents(people);
		
		people.sort(Comparator.comparingInt(Person::getAge));	//sort by age
		
		System.out.println("\nSorted by age");
		printContents(people);
		
		people.sort(Comparator.comparing(Person::getName));		//sort by name
		
		System.out.println("\nSorted by name");
		printContents(people);
		
	}
}
