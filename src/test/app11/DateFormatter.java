package test.app11;

import java.util.Calendar;

public abstract class DateFormatter {

	private String formatString = "";
	public void setFormatString(String formatString) {
		this.formatString = formatString;
	}
	public String getFormatString() {
		return formatString;
	}
	public abstract String format(Calendar c);
}
