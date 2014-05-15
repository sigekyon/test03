package test.app14;

public class Sample7 {
	public static void main(String[] args) {
		long longMax = Long.MAX_VALUE;
		float v = longMax;
		System.out.println(longMax);
		System.out.println(v);
		System.out.println("------------------------------");
		double x1 = 1.99;
		System.out.println((long)x1);
		System.out.println((long)(-x1));
		double x2 = (double)Long.MAX_VALUE;
		System.out.println(x2);
		System.out.println((long)x2);
		int x3 = (int)(-255.0);
		byte x4 = (byte)(-255.0);
		System.out.println(x3);
		System.out.println(Integer.toBinaryString(x3));
		System.out.println(x4);
	}
}
