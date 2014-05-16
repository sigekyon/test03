package test.app20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleFinally2 {
	public String execute() {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.print("Input name: ");
		String name;
		try {
			name = in.readLine();
			return name;
		} catch (IOException e) {
			return "Exception";
		} finally {
			return "Finally";
		}
	}
	public static void main(String[] args) {
		SampleFinally2 sample = new SampleFinally2();
		System.out.println(sample.execute());
	}
}
