package test.app06;

public class B extends A {
	@Override
	boolean aMethod() {
		System.out.println("オーバーライド済 :");
		return false;
	}
}