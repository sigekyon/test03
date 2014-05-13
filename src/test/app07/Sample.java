package test.app07;

public class Sample {

	public static void main(String[] args) {
        System.out.println("ConstructorTestBase()  :-----");
        ConstructorTestBase c = new ConstructorTestBase();
        System.out.println("ConstructorTestBase1(1):-----");
        ConstructorTestBase1 c1 = new ConstructorTestBase1(1);
        System.out.println("ConstructorTestBase2() :-----");
        ConstructorTestBase2 c2 = new ConstructorTestBase2();
        System.out.println("ConstructorTestBase2(5):-----");
        c2 = new ConstructorTestBase2(5);
	}

}
