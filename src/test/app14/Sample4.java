package test.app14;

public class Sample4 {
	void print(Object v) {
		if (v instanceof Integer) {
			Integer i = (Integer)v;
			System.out.println("Object -> Integer: " + i);
		} else {
			System.out.println(v.toString());
		}
	}

	public java.util.List createList() {
		return new java.util.LinkedList();
	}
	/*
	public java.util.LinkedList createLinkedList() {
		java.util.List list = new java.util.LinkedList();
		return list;
	}
	*/

	public static void main(String[] args) {
		Sample4 app = new Sample4();
		java.util.List list = app.createList();
		list.add(Integer.valueOf(1));
		list.add(Boolean.valueOf(true));
	
		list.add((Object)"Hello");
		list.add(app);
		for (Object o: list) {
			app.print(o);
		}
		app = null;
		list = null;
	}
}
