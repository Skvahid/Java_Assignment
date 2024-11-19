package app_java_abstract;

abstract public class A {
	int x= 50;
	static int y =30;
	abstract public void test1();
	public void test2() {
		 System.out.println(95);
	}
	
	

}


package app_java_abstract;

abstract public class C extends A {
	abstract public void test3();

}


package app_java_abstract;

public class B extends C {
	@Override
	public void test1() {
		System.out.println("vahid shaik");
		
	}
	@Override
	public void test3() {
		System.out.println(1100.64664);
		
	}
	public static void main(String[] args) {
		B b1 = new B();
	b1.test1();	
	b1.test2();
	System.out.println(b1.x);
	System.out.println(A.y);
	b1.test3();
	}

}
