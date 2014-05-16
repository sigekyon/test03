package test.app17;

import java.util.Calendar;

public class Sample1 {
	private String[] months = new String[] {
			   "JANUARY", "FEBRUARY", "MARCH", "APRIL",
			   "MAY", "JUNE", "JULY", "AUGUST",
			   "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER",
			};
			public void exec() {
				System.out.println("2011”N");
				for (int i=0 ; i<months.length ; i++) {
					String s = (i+1) + "ŒŽ";
		  
					switch (i) {
					case Calendar.FEBRUARY:
						s = s + ":" + months[i] + "(28“ú)";
						break;
					case Calendar.APRIL:
					case Calendar.JUNE:
					case Calendar.SEPTEMBER:
					case Calendar.NOVEMBER:
						s = s + ":" + months[i] + "(30“ú)";
						break;
					case Calendar.JANUARY:
					case Calendar.MARCH:
					case Calendar.MAY:
					case Calendar.JULY:
					case Calendar.AUGUST:
					case Calendar.OCTOBER:
					case Calendar.DECEMBER:
						s = s + ":" + months[i] + "(31“ú)";
						break;
					}
					System.out.println(s);
				}
			}
			public static void main(String[] args) {
				Sample1 app = new Sample1();
				app.exec();
			}

}
