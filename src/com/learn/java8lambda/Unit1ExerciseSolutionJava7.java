package com.learn.java8lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

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
		
		Collections.sort(people, new Comparator() {
			public int compare(Person a1,Person a2) {
				// TODO Auto-generated method stub
				return a1.getLastname().compareTo(a2.getLastname());
			}

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
	//	step2:	create the method to print all elements
		printAll(people);
	//	Step 3: print all people last name ending with C	
		printEndingwithC(people);
		printConditional(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastname().startsWith("C");
			}
			
		});
		
		printConditional(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstName().startsWith("C");
			}
			
		});
	}
	
	

	private static void printAll(List<Person> people) {
		// TODO Auto-generated method stub
		for(Person p: people) {
			System.out.println(p);
		}
	}
	
	private static void printEndingwithC(List<Person> people) {
		// TODO Auto-generated method stub
		for(Person p: people) {
			if(p.getLastname().startsWith("C")) {
			System.out.println(p);
			}
		}
	}
	private static void printConditional(List<Person> people,Condition condition) {
		// TODO Auto-generated method stub
		for(Person p: people) {
			if(condition.test(p)) {
			System.out.println(p);
			}
		}
	}
	
	interface Condition{
		boolean test(Person p);
	}

}
