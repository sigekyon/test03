package test.app16;

public class Sample1 {
	public static void main(String[] args) {
		java.util.ArrayList<String> setExpression = new java.util.ArrayList<String>();
		setExpression.add("��1��");
		setExpression.add("��2��");
		setExpression.add("��3��");
		setExpression.add("��4��");
		setExpression.add("��5��");
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
