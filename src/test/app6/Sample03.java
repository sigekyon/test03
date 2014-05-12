package test.app6;

public class Sample03 {

	public static void main(String[] args) {
		B b = new B();
		
		System.out.println("b.baseField      :" + b.baseField);
		System.out.println("b.baseMethod()   :" + b.baseMethod());
		
		System.out.println("b.aMethod()      :" + b.aMethod());
		System.out.println("-------------------------");
 
		A a = new A();
		System.out.println("a.baseField      :" + a.baseField);
		System.out.println("a.baseMethod()   :" + a.baseMethod());
		System.out.println("a.aMethod()      :" + a.aMethod());
	}

}
