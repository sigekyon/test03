package test.app16;

public class Sample1 {
	public static void main(String[] args) {
		java.util.ArrayList<String> setExpression = new java.util.ArrayList<String>();
		setExpression.add("第1回");
		setExpression.add("第2回");
		setExpression.add("第3回");
		setExpression.add("第4回");
		setExpression.add("第5回");
/*		for (
			java.util.Iterator<String> it = setExpression.iterator();
			it.hasNext();
		) {
			String element = it.next();
			System.out.println(element);
		}*/
		for (String element : setExpression) {
			System.out.println(element);
		}
	}
}
