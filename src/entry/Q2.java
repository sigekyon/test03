package entry;

/* 2-2
 * 2,4,5,7
*/

import java.util.Random;
import java.util.Scanner;


public class Q2 {

	public static void main(String[] args) {
		app1();
		System.out.println("\n----------\n");
		app3();
	}
//	2-1
	static void app1(){
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);
	}
//	2-3
	static void app3(){
		String name = null;
		String ageString = null;
		int age = 0;
		int fortune = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		name = scan.nextLine();
		System.out.println("あなたの年齢を入力してください");
		ageString = scan.nextLine();
		age = Integer.parseInt(ageString); 
		scan.close();
		fortune = new Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");		
	}
	
}
