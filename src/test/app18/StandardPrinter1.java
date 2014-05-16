package test.app18;

public class StandardPrinter1 {
	@Override
	public String toString() {
		return "StandardPrinter";
	}
	public static void main(String[] args) {
		StandardPrinter1 app = new StandardPrinter1();
		System.out.println(app.toString());
	}
}