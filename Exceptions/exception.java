package app_java_exception;

public class A {
	public static void main(String[] args) {
		try {
		int x = 40;
		int y = 0;
		int z=x/y;
		System.out.println(z);
		}
		catch(Exception a) {
		System.out.println(a);
		a.printStackTrace();
		}
		System.out.println(1000);
		
	}

}


// package app_java_exception;

// public class B {
// 	int x = 40;

// 	public static void main(String[] args) {
// 		try {
// 			B a1 = null;
// 			System.out.println(a1.x);
// 		} catch (Exception a) {
// 			a.printStackTrace();
// 		}
// 		System.out.println(10000);
// 	}
// }



// package app_java_exception;

// public class C {
// 	public static void main(String[] args) {
// 		try {
// 		String x ="vahid5593";
// 		int y = Integer.parseInt(x);
// 		System.out.println(y);
// 		}catch(Exception z) {
// 			System.out.println(z);
// 			z.printStackTrace();
// 		}
				
// 	}

// }
