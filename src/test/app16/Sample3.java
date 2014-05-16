package test.app16;

public class Sample3 {
	public static void main(String[] args) {
		java.util.ArrayList<String> setExpression = new java.util.ArrayList<String>();
		setExpression.add("‘æ1‰ñ");
		setExpression.add("‘æ2‰ñ");
		setExpression.add("‘æ3‰ñ");
		setExpression.add("‘æ4‰ñ");
		setExpression.add("‘æ5‰ñ");
		for (String element : setExpression) {
			if ("‘æ2‰ñ".equals(element)) {
				continue;
			}
			System.out.println(element);
		}
		for (String element : setExpression) {
			if ("‘æ3‰ñ".equals(element)) {
				break;
			}
			System.out.println(element);
		}
	}
}
