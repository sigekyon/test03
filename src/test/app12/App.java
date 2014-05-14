package test.app12;

public class App {
	final static long INTERVAL = 1000;
	public void execute() throws Exception {
		int count = 12;
		while (count > 0) {
			Thread.sleep(INTERVAL);
			count--;
			System.out.println(count);
		}
	}
	public static void main(String[] args) throws Exception {
		App app = new App();
		app.execute();
	}

}
