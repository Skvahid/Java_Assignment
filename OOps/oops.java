package app_java_oops;

public class A {
	public void test() {
		System.out.println(10000);
	}

}


package app_java_oops;

public class B extends A{
	@Override
	public void test() {
		System.out.println(100);

	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		B b1 = new B();
		b1.test();
	}

}



//  package app_java_oops;

// public class cat {
// 	public void run() {
// 		System.out.println("running");
// 	}
// 	public void fly() {
// 		System.out.println("not fly");
// 	}
// 	public void drink() {
// 		System.out.println("milk");
// 	}
// 	public void sound() {
// 		System.out.println("meow");
// 	}

// }



// package app_java_oops;

// public class Dog extends cat {
	
// 	public void eat() {
// 		System.out.println("meat");
		
// 	}

// }


// package app_java_oops;

// public class Horse extends Dog {
// 	public static void main(String[] args) {
//      Horse h1 = new Horse();
//      h1.run();
//      h1.fly();
//      h1.drink();
//      h1.sound();
//      h1.eat();
     
// 	}
// }
