package app_java_constructor;

public class A {
	A(){
		System.out.println('z');
		
	}
	A(int x){
		System.out.println(x);
	}
	A(int x,String y){
		this(10);
		System.out.println(x);
		System.out.println(y);
		A a3 = new A();

	}
	A(String z){
		System.out.println(z);
		A a2 = new A(10,"adil");
		
	}
	public static void main(String[] args) {
		A a1 = new A("vahid");


	}

}
