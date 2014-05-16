package test.app17;

import java.util.ArrayList;
import java.util.List;

public class Sample6 {
	  class ArrowKeys {
	        public static final int UP = 0x01;
	        public static final int RIGHT = 0x02;
	        public static final int DOWN = 0x04;
	        public static final int LEFT = 0x08;
	    }
	  
	    public void exec() {
	        List<Integer> keys = new ArrayList<Integer>();
	        keys.add(ArrowKeys.UP);
	        keys.add(ArrowKeys.RIGHT);
	        keys.add(ArrowKeys.UP+ArrowKeys.RIGHT);
	        keys.add(ArrowKeys.DOWN);
	        keys.add(ArrowKeys.UP+ArrowKeys.DOWN);
	        keys.add(ArrowKeys.UP+ArrowKeys.RIGHT + ArrowKeys.DOWN+ArrowKeys.LEFT);
	        for (int e : keys) {
	            System.out.print(e + ":");
	            if ((e & ArrowKeys.UP) != 0) {
	                System.out.print("UP, ");
	            }
	            if ((e & ArrowKeys.RIGHT) != 0) {
	                System.out.print("RIGHT, ");
	            }
	            if ((e & ArrowKeys.DOWN) != 0) {
	                System.out.print("DOWN, ");
	            }
	            if ((e & ArrowKeys.LEFT) != 0) {
	                System.out.print("LEFT, ");
	            }
	                System.out.println("");
	        }
	    }
	    public static void main(String[] args) {
	    	Sample6 app = new Sample6();
	        app.exec();
	    }

}
