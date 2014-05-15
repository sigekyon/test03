package test.app14;

public class Sample5 {
	public static void main(String[] args) {
		{
			Integer o1 = 1;
			Double o2 = 1.0;
			Boolean o3 = true;

			int x1 = o1;
			double x2 = o2;
			boolean x3 = o3;
		}

		{
			Integer o1 = Integer.valueOf(1);
			Double o2 = Double.valueOf(1.0);
			Boolean o3 = Boolean.valueOf(true);
			
			int x1 = o1.intValue();
			double x2 = o2.doubleValue();
			boolean x3 = o3.booleanValue();
		}
	}
}
