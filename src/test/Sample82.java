package test;

public class Sample82 {
		 
	    String s = "0123";
	 
	    public void test() {
	        char[] c0123 = s.toCharArray();
	        System.out.print("s.toCharArray():");
	        for (int i=0 ; i < c0123.length ; i++) {
	            System.out.print(c0123[i] + " ");
	        }
	        System.out.println("");
	    }
	 
	    public static void main(String[] args) {
	        Sample82 sample82 = new Sample82();
	        sample82.test();
	    }
}
