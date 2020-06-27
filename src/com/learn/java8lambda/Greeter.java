package com.learn.java8lambda;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args){
		Greeter greeter= new Greeter();
	//	Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting myLambdaGreeting= () -> System.out.println("hello world");
	//	helloWorldGreeting.perform();
		myLambdaGreeting.perform();
		
		Greeting innerGreeting = new Greeting() {
			public void perform() {
				System.out.println("hello world");
			}
		};
		
		
		
		innerGreeting.perform();
		//greeter.greet(helloWorldGreeting);
		greeter.greet(myLambdaGreeting);
		greeter.greet(innerGreeting);
		
		
		
//		MyLambda	myLambdaFunction= () -> System.out.println("hello world");
	//	Greeting	myLambdaFunction= () -> System.out.println("hello world");
		
		//	MyLambdaAdd addFunction= (int a, int b)->  a+b;
	}
}

//interface MyLambda{
//	void foo();
//}
//
//interface MyLambdaAdd{
//	int foo(int a, int b);
//}
	
//	greetingFunction =() -> System.out.println("hello World");
//	greet(greetingFunction);
//	greet(() -> System.out.println("hello World"));
//	doubleNumberFunction = (int a) ->{return a *2};
//	addFunction= (int a, int b)-> return a+b;
//	safeDevide= (int a, int b)-> {
//		if b==0) return 0;
//		return a/b;
//	};
//	
//stringLengthFunction = (String s)-> s.length();