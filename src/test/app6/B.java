package test.app6;

public class B extends A {
	@Override
	boolean aMethod() {
		System.out.println("オーバーライド済 :");
		return false;
	}
}