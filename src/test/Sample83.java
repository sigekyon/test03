package test;

public class Sample83 {
	String s = "0123";
	
	public void test() {
		StringBuilder sb = new StringBuilder(s);
		char c = 'a';
		
		System.out.println("s    :" + s);
		System.out.println("sb   :" + sb);
		System.out.println("c    :" + c);

		test1(s, sb, c);

		System.out.println("s    :" + s);
		System.out.println("sb   :" + sb);
		System.out.println("c    :" + c);
	}

	public void test1(String ps, StringBuilder psb, char pc) {
		System.out.println("---test11");
		System.out.println("ps   :" + ps);
		System.out.println("psb  :" + psb);
		System.out.println("pc   :" + pc);
		System.out.println("---test11");
		
		ps = "5678";
		psb.append("4567");
		pc = 'b';

		System.out.println("---test12");
		System.out.println("ps   :"+ps);
		System.out.println("psb  :"+psb);
		System.out.println("pc   :"+pc);
		System.out.println("---test12");
	}

	public static void main(String[] args) {
		Sample83 sample83 = new Sample83();
		sample83.test();
	}

}
