package com.learn.java8lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8Unit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
			new Person("Charles","Dickens",60),
			new Person("Lewis","Carrol",42),
			new Person("Thomos","Carleys",53),
			new Person("Charlatte","Bronte",45),
			new Person("Methew","Arnold",39)
		);
		//step1 short list by last name
		
		Collections.sort(people, ( p1,  p2)-> p1.getLastname().compareToIgnoreCase(p2.getLastname()));
				
	//	step2:	create the method to print all elements
		//printAll(people);
		printConditional(people,p->true);
	//	Step 3: print all people last name ending with C	
		printConditional(people, p->p.getLastname().startsWith("C"));
		
		printConditional(people, p->p.getFirstName().startsWith("C"));
	}
	
	


	private static void printConditional(List<Person> people,Predicate<Person> predicate) {
		// TODO Auto-generated method stub
		for(Person p: people) {
			if(predicate.test(p)) {
			System.out.println(p);
			}
		}
	}
	
//	interface Condition{
//		boolean test(Person p);
//	}

}
