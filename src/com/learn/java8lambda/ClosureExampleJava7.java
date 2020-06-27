package com.learn.java8lambda;

public class ClosureExampleJava7 {

//	public static void main(String []args) {
//		int a=10;
//		 int b=20; //Java 7 ou have to declare b final in java 8 we dont need to
//		dpProcess(a, new Process() {
//			@Override
//			public  void process(int i) {
//				System.out.println(i+b);
//			}
//		});
//	}
	
	
	public static void main(String []args) {
		int a=10;
		 int b=20; 
		dpProcess(a, i-> System.out.println(i+b));
	}
	
	public static void dpProcess(int i, Process p) {
		p.process(i);
	}
	
}
interface Process{
	void process(int i);
}
