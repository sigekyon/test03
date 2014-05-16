package test.app17;

import java.util.EnumMap;

public class Sample5 {
	 private enum Month {
	      JANUARY, FEBRUARY, MARCH, APRIL,
	      MAY, JUNE, JULY, AUGUST,
	      SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	    }
	    private EnumMap<Month, Integer> monthMap;
	  
	    public Sample5() {
	        monthMap = new EnumMap<Month, Integer>(Month.class);
	        monthMap.put(Month.JANUARY, 1);
	        monthMap.put(Month.FEBRUARY, 2);
	        monthMap.put(Month.MARCH, 3);
	        monthMap.put(Month.APRIL, 4);
	        monthMap.put(Month.MAY, 5);
	        monthMap.put(Month.JUNE, 6);
	        monthMap.put(Month.JULY, 7);
	        monthMap.put(Month.AUGUST, 8);
	        monthMap.put(Month.SEPTEMBER, 9);
	        monthMap.put(Month.OCTOBER, 10);
	        monthMap.put(Month.NOVEMBER, 11);
	        monthMap.put(Month.DECEMBER, 12);
	    }
	    public void exec() {
	        System.out.println("2011”N");
	        for (Month m : Month.values()) {
	            String s = monthMap.get(m) + "ŒŽ";
	            switch (m) {
	            case FEBRUARY:
	                s = s + ":" + m + "(28“ú)";
	                break;
	            case APRIL:
	            case JUNE:
	            case SEPTEMBER:
	            case NOVEMBER:
	                s = s + ":" + m + "(30“ú)";
	                break;
	            case JANUARY:
	            case MARCH:
	            case MAY:
	            case JULY:
	            case AUGUST:
	            case OCTOBER:
	            case DECEMBER:
	                s = s + ":" + m + "(31“ú)";
	                break;
	            }
	            System.out.println(s);
	        }
	    }
	    public static void main(String[] args) {
	    	Sample5 app = new Sample5();
	        app.exec();
	    }

}
