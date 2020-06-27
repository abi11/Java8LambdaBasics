package com.learn.java8lambda;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
		});
		myThread.run();
	//same with lambda	
		Thread myLambdaThread = new Thread(() ->System.out.println("Printed inside myLambdaThread"));
	    myLambdaThread.run();
	}

}
