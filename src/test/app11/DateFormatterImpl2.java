package test.app11;

import java.util.Calendar;
import java.util.Formatter;

public class DateFormatterImpl2 extends DateFormatter {

	private StringBuilder sb = new StringBuilder();
	private Formatter formatter = new Formatter(sb);
	
	@Override
	public String format(Calendar c) {
		sb.delete(0, sb.length());
		formatter.format(getFormatString(), c);
		return sb.toString();
	}

}
