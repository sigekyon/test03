package test.app7;

public class ConstructorTestBase2 {
	int n;
	ConstructorTestBase2() {
		this(0);
		System.out.println("ConstructorTestBase2:�����Ȃ��̃R���X�g���N�^");
	}
		ConstructorTestBase2(int n) {
		super();
		this.n = n;
		System.out.println("ConstructorTestBase2:" + n);
	}
}
