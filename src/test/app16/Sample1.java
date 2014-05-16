package test.app16;

public class Sample1 {
	public static void main(String[] args) {
		java.util.ArrayList<String> setExpression = new java.util.ArrayList<String>();
		setExpression.add("‘æ1‰ñ");
		setExpression.add("‘æ2‰ñ");
		setExpression.add("‘æ3‰ñ");
		setExpression.add("‘æ4‰ñ");
		setExpression.add("‘æ5‰ñ");
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
