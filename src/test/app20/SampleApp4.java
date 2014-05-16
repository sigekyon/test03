package test.app20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SampleApp4 {
	public void execute() throws java.io.IOException {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("src/test/app20/SampleApp2.java"));
			BufferedWriter out = null;
			try {
				out = new BufferedWriter(new FileWriter("src/test/app20/SampleApp2.txt"));
				String line;
				while ((line = in.readLine()) != null) {
					out.write(line);
					out.newLine();
					out.flush();
				}
			} catch (java.io.IOException e) {
				e.printStackTrace();
			} finally {
				if (out != null) {
					out.close();
				}
			}
		} catch (java.io.IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
	public static void main(String[] args) {
		SampleApp4 app = new SampleApp4();
		try {
			app.execute();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
