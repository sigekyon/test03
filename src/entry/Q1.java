package entry;

/* 1-1
 * ア：コンパイラ
 * イ：インタプリタ：
 * ウ：ソースコード
 * エ：バイトコード
 * オ：JVM
*/

public class Q1 {

	public static void main(String[] args) {
		app2();
	}
	
	static void app2(){
		int a = 3;
		int b = 5;
		int c= a * b;
		
		System.out.println("縦幅3横幅5の長方形の面積は、" + c);
	}
//	1-3
	static void app3(){
		boolean d = true;
		char e = '駆';
		double f = 3.14;
		long g = 314159265853979L;
		String h = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";
	}

}
