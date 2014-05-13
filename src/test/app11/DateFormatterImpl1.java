package test.app11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatterImpl1 extends DateFormatter {

	@Override
	public String format(Calendar c) {
		SimpleDateFormat df = new SimpleDateFormat(getFormatString());
		return df.format(new Date(c.getTimeInMillis()));
	}

}
