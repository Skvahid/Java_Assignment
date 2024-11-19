package app_java_method;

public class A {
	static int i= 100;
	int j =499;
	public static void main(String argd[]) {
		System.out.println(i);
		A a1 = new A();
		System.out.println(a1.j);
		
	}

}


package app_java_method;

public class B {
	public static void main(String args[]) {
		B a1 = new B();
		a1.test();
	}
	public void test() {
		System.out.println(100);
	}

}


package app_java_method;

public class C {
	public static void main(String args[]) {
		C a1 = new C();
		a1.test(50);
	}

	public void test(int x) {
		System.out.println(x);
	}
}
