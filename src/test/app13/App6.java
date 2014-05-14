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
			System.out.println("écÇËéûä‘ÅF" + App6.super.count + "ïb");
			System.out.println("App6	ÅF" + App6.this.count + "ïb");
			System.out.println("Inner   ÅF" + count + "ïb");
		}
	}
	public static void main(String[] args)
	throws Exception {
		App6 app6 = new App6();
		app6.execute();
	}
}
