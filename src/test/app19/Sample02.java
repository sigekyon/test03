package test.app19;

import java.io.IOException;

public class Sample02 {
	public static void main(String[] args) throws IOException {
		Sample02 app = new Sample02();
		try {
			app.exec();
		} catch (IOException e) {
	  System.err.println("in.close()��IOException������");
		}
	}
 
	public void exec() throws IOException {
		java.io.BufferedReader in = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("Input name:");
		String name;
		try {
			name = in.readLine();
			System.out.println("Hello, "+name);
		} catch (java.io.IOException e) {
			System.err.println("in.readLine()��IOException������");
		} finally {
			in.close();
		}
	}
}
