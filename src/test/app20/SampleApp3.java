package test.app20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SampleApp3 {
	public void execute() throws java.io.IOException {
		java.util.List<String> lines = new java.util.LinkedList<String>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("src/test/app20/SampleApp.java"));
			String line = null;
			while ((line = in.readLine()) != null) {
				lines.add(line);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("src/test/app20/SampleApp.txt"));
			for (String line : lines) {
				out.write(line);
				out.newLine();
			}
			out.flush();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
	public static void main(String[] args) {
		SampleApp3 app = new SampleApp3();
		try {
			app.execute();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
