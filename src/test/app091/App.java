package test.app091;

public class App {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.f1 = "f1";
		System.out.println(sample.f1);
//		sample.f2 = "f2";
		Sample2 sample2 = new Sample2();
		sample2.f1 = "f1";
		System.out.println(sample2.getF1());
	}
}
