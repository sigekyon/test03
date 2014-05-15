package test.app14;

public class Sample8 {
	public static void main(String[] args) {
		byte b0 = 1;
		System.out.println("b0\t:"+b0);
		byte b1 = 2;
		System.out.println("b1\t:"+b1);
		//byte b2 = b0 + b1;
		byte b2 = (byte)(b0 + b1);
		System.out.println("b0+b1\t:"+b2);
		float f0 = 1.0f;
		System.out.println("f0\t:"+f0);
		//float f1 = 2.0;
		float f1 = (float)2.0;
		System.out.println("f1\t:"+f1);
		float f2 = f0 + f1;
		System.out.println("f0+f1\t:"+f2);
		double d0 = 5.0;
		System.out.println("d0\t:"+d0);
		double d1 = f0 + d0;
		System.out.println("f0+d0(double)\t:"+d1);
		//float f3 = f0 + d0;
		float f3 = (float)(f0 + d0);
		System.out.println("f0+d0(float)\t:"+f3);
	}
}
