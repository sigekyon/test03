package test.app13;

public class App6 extends App4 {
	int count = -1;
	App6() {
		super();
		view.addObserver(new RemainViewEx());
	}
	class RemainViewEx extends RemainView {
		int count = -2;
		@Override
		public void update() {
			System.out.println("�c�莞�ԁF" + App6.super.count + "�b");
			System.out.println("App6	�F" + App6.this.count + "�b");
			System.out.println("Inner   �F" + count + "�b");
		}
	}
	public static void main(String[] args)
	throws Exception {
		App6 app6 = new App6();
		app6.execute();
	}
}
