package test.app16;

public class Sample3 {
	public static void main(String[] args) {
		java.util.ArrayList<String> setExpression = new java.util.ArrayList<String>();
		setExpression.add("��1��");
		setExpression.add("��2��");
		setExpression.add("��3��");
		setExpression.add("��4��");
		setExpression.add("��5��");
		for (String element : setExpression) {
			if ("��2��".equals(element)) {
				continue;
			}
			System.out.println(element);
		}
		for (String element : setExpression) {
			if ("��3��".equals(element)) {
				break;
			}
			System.out.println(element);
		}
	}
}
