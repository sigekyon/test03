package test.app4;

public class Sample2 {
	static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		int n = Integer.parseInt("-123");
		print(n + "");
		Integer v = Integer.decode("0x20");
		print(v + "");
		print(System.getProperty("java.version"));
		print(System.getProperty("os.name"));
		print(System.currentTimeMillis() + "");
	}
}
