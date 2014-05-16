package test.app17;

public class Sample3 {
	public static void main(String[] args) {
		Sample2[] ms = Sample2.values();
		for (Sample2 m : ms) {
			System.out.println(m);
		}
		for (Sample2 m : ms) {
			if (m == Sample2.JANUARY) {
				System.out.println("m equals " + m);
			}
		}
	}
}
