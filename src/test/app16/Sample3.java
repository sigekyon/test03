package test.app16;

public class Sample3 {
	public static void main(String[] args) {
		java.util.ArrayList<String> setExpression = new java.util.ArrayList<String>();
		setExpression.add("第1回");
		setExpression.add("第2回");
		setExpression.add("第3回");
		setExpression.add("第4回");
		setExpression.add("第5回");
		for (String element : setExpression) {
			if ("第2回".equals(element)) {
				continue;
			}
			System.out.println(element);
		}
		for (String element : setExpression) {
			if ("第3回".equals(element)) {
				break;
			}
			System.out.println(element);
		}
	}
}
