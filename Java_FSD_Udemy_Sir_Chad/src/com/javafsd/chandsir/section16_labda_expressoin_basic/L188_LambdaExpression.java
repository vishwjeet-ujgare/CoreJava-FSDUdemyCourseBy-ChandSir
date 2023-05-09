package com.javafsd.chandsir.section16_labda_expressoin_basic;

public class L188_LambdaExpression {

	interface Lambda {
		public void demo();
	}

	public static void main(String[] args) {
	
		//general method to call demo 
		Lambda l=new Lambda() {
		@Override
		public void demo() {
			System.out.println("Hello ");	
		}
	};
	l.demo();
		
	
	//by using lambda
		Lambda lambda = () -> System.out.println("Hello ");
		lambda.demo();
	}

}

/*
 * This Java code demonstrates the usage of lambda expressions to implement a functional interface in Java.

In this example, a functional interface named Lambda is declared, which has a single abstract method named demo(). The Lambda interface is implemented using both the traditional anonymous class syntax and lambda expression syntax.

The main() method demonstrates the usage of both the implementations. Firstly, an object of the Lambda interface is created using an anonymous inner class, and the demo() method is implemented by printing "Hello" to the console. The demo() method is then invoked on this object to print "Hello".

Next, a lambda expression is used to implement the Lambda interface. The lambda expression () -> System.out.println("Hello ") implements the demo() method by printing "Hello" to the console. A variable named lambda of type Lambda is then declared and initialized with this lambda expression. Finally, the demo() method is invoked on the lambda object to print "Hello" to the console.F
 */
