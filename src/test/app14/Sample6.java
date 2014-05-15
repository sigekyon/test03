package test.app14;

public class Sample6 {
	static class PrintApp {
		public void print(int v) {
			Integer i = Integer.valueOf(v);
			String s = i.toString();
			System.out.println(s);
		}
		public void print(double v) {
			Double d = Double.valueOf(v);
			String s = d.toString();
			System.out.println(s);
		}
		public void print(Double v) {
			System.out.println("Double:"+v);
		}
	}
	public static void main(String[] args) {
		PrintApp app = new PrintApp();
		app.print(1);
		app.print(Integer.valueOf(2));
		app.print(2.0);
		app.print(Double.valueOf(2.0));
	}
}
