package test.app12;

public class App2 {
	final static long INTERVAL = 1000;
	public void execute() throws Exception {
		int count = 12;
		int startValue = count;
		long startTime = System.currentTimeMillis();
		while (count > 0) {
			Thread.sleep(INTERVAL);
			count--;
			System.out.print(".");
			boolean isNewLine =
			((startValue - count) % 10) == 0;
			if (isNewLine && count != 0) {
				System.out.println("");
			}
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("�J�n�����F" + startTime);
		System.out.println("�J�E���g�F" + startValue);
		System.out.println("�I�������F" + stopTime);
	}
	public static void main(String[] args)
	throws Exception {
		App2 app = new App2();
		app.execute();
	}
}
