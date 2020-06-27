package com.learn.java8lambda;

import java.util.function.BiConsumer;

public class Unit2ExceptionalHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] somenumbers= {1,2,3,4,5};
		int key=0;
		process(somenumbers,key,wrapperLambda((v,k)->System.out.println(v/k)));
		

	}
	
	private static void process(int[] somenumbers, int key,BiConsumer<Integer,Integer> consumer) {
		for(int i : somenumbers) {
			//System.out.println(i+ key);
			consumer.accept(i,key);
		}
	}
	
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
		return (v,k)-> {
			try {
			consumer.accept(v,k);
			}catch(ArithmeticException e) {
				System.out.println("Arthematic exception");
		}
		};
	}
}
