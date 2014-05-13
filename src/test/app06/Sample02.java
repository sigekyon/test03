package test.app06;

/**
 * @author tchiba
 *
 */
class Base {
	int baseField = 1;

	boolean baseMethod() {
		return false;
	}
}

class A extends Base {
	int aField = 10;
	boolean aMethod() {
		System.out.println("aMethod:baseField:" + baseField);
		return !baseMethod();
	}
}
public class Sample02 {

	public static void main(String[] args) {
		Base base = new Base();
		A a = new A();
		
		System.out.println("base.baseField   :" + base.baseField);
		System.out.println("base.baseMethod():" + base.baseMethod());
		
		System.out.println("a.baseField      :" + a.baseField);
		System.out.println("a.baseMethod()   :" + a.baseMethod());
		
		System.out.println("a.aField		 :" + a.aField);
		System.out.println("a.aMethod()      :" + a.aMethod());
		
		base.baseField = 3;
		System.out.println("base.baseField   :" + base.baseField);
		System.out.println("a.baseField      :" + a.baseField);
		
		a.baseField = 30;
		System.out.println("base.baseField   :" + base.baseField);
		System.out.println("a.baseField      :" + a.baseField);

	}

}
