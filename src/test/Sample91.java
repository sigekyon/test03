package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sample91 {
	public static void main(String[] args) {
		new Sample91().execute();
	}

	public void execute() {
		list(new ArrayList());
		list(new LinkedList());
	}

	public void list(java.util.List list) {
		list.add("A");
		list.add("B");
		for (int i = 0 ; i < list.size() ; i++) {
			String s = (String)list.get(i);
			System.out.print(s + " ");
		}
		System.out.println("");
	}
}
