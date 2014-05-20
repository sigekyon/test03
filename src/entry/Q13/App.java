package entry.Q13;
/*13-1
 * Sword,Sword,Item,Monster,Slime,Monster
 * 13-2
 * 1.a()
 * 2.AaBb
*/
public class App {
		public final class A extends Y{
			public void a(){
				System.out.print("Aa");
			}
			public void b(){
				System.out.print("Ab");
			}
			public void c(){
				System.out.print("Ac");
			}
		}
		public class B extends Y{
			public void a(){
				System.out.print("Ba");
			}
			public void b(){
				System.out.print("Bb");
			}
			public void c(){
				System.out.print("Bc");
			}
		}
		public interface X{
			void a();
		}
		public abstract class Y implements X{
			public abstract void a();
			public abstract void b();
		}
		public static void main(String[] args) {
			App app = new App();
			Y array[] = new Y[2];
			array[0] = app.new A();
			array[1] = app.new B();
			
			for(Y y : array){
				y.b();
			}

		}
}
