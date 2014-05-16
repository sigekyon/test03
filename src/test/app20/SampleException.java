package test.app20;

public class SampleException extends Exception {
	private static final long serialVersionUID = 1L;
	private int code;
	public SampleException(int code, String message) {
		super(message);
		this.code = code;
	}
	public int getCode() {
		return code;
	}
}
