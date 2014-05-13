package test.app7;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println("ConstructorTest1():-----");
		ConstructorTest1 c1 = new ConstructorTest1();
		System.out.println("ConstructorTest2():-----");
		ConstructorTest2 c2 = new ConstructorTest2();
		System.out.println("ConstructorTest2(10):-----");
		c2 = new ConstructorTest2(10);
		System.out.println("ConstructorTest2(10, 5):-----");
		c2 = new ConstructorTest2(10, 5);
	}

}
