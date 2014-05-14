package test.app13;

public class App8 {
	class Ic implements Ii {
		String value;
		Ic(String v) {
			value = v;
		}
		public void print() {
			System.out.println("Ic1:" + value);
		}
	}
	interface Ii {
		void print();
	}
	Ii[] objs = new Ii[5];
	public void execute() {
		objs[0] = new Ic("objs[0]");
		objs[1] = new Ic("objs[1]") {
			public void print() {
				System.out.println("無名内部クラス objs[1]:" + value);
			}
		};
		objs[2] = new Ii() {
			public void print() {
				System.out.println("無名内部クラス objs[2]:");
			}
		};
		objs[3] = new Ii() {
			String value = "objs3";
			public void print() {
				System.out.println("無名内部クラス objs[3]:" + value);
			}
		};
		objs[4] = new Ii() {
			String value;
			{
				value = "objs" + 4;
			}
			public void print() {
				System.out.println("無名内部クラス objs[4]:" + value);
			}
		};
		for (Ii o : objs) {
			o.print();
		}
	}
	public static void main(String[] args) {
		App8 app8 = new App8();
		app8.execute();
	}
}
