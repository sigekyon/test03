package test.app13;

public class App5 extends App4{
	App5() {
		super();
		view.addObserver(new RemainViewEx());
	}
	class RemainViewEx extends RemainView {
		@Override
		public void update() {
			System.out.println("écÇËéûä‘ÅF" + count + "ïb");
		}
	}
	public static void main(String[] args)
	throws Exception {
		App5 app5 = new App5();
		app5.execute();
	}
}
