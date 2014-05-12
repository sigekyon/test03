package test;
import java.util.*;
public class Sample90 {

	public static void main(String[] args) {
		new Sample90().execute();
	}
	
	public void execute() {
		ArrayList alist = new ArrayList();
		alist.add("A");
		alist.add("B");

		for (int i = 0 ; i < alist.size() ; i++) {
			String s = (String)alist.get(i);
			System.out.print(s + " ");
		}
 
		System.out.println("");
		LinkedList llist = new LinkedList();
		llist.add("A");
		llist.add("B");
		for (int i = 0 ; i < llist.size() ; i++) {
			String s = (String)llist.get(i);
			System.out.print(s + " ");
		}
	}
}
