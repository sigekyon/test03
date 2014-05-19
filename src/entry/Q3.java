package entry;


/* 3-1
 * 1:weight == 60
 * 2:age1 + age2 > 60
 * 3:age%2 == 1
 * 4:name.equals("湊")
 * 3-2
 * C,D,E
 * 3-4
 * else節に｛｝がついておらず、構文エラーとなっているため、
 * else{
 * -略-
 * }
 * とする。
*/

import java.util.Random;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		app3();
		app5(scan);
		app6(scan);
		scan.close();
	}
	
	static void app3(){
		int seibetsu = 1;
		int age = 28;
		
		System.out.println("こんにちは。");
		if(seibetsu == 0){
			System.out.println("私は男です。");
			System.out.println(age + "歳です。");
		}
		else if(seibetsu == 1){
			System.out.println("私は女です。");
		}
		System.out.println("よろしくおねがいします。");
	}
	
	static void app5(Scanner scan){
		int selected;
		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更 >");
		selected=scan.nextInt();
		switch(selected){
		case 1:
			System.out.println("検索します。");
			break;
		case 2:
			System.out.println("登録します。");
			break;
		case 3:
			System.out.println("削除します。");
			break;
		case 4:
			System.out.println("変更します。");
			break;
		default:
			System.out.println("-----");
			break;
		}
	}
	
	static void app6(Scanner scan){
		int ans = new Random().nextInt(10);
		int num;
		
		System.out.println("【数あてゲーム】");
		for(int cnt = 0; cnt < 5; cnt++){
			System.out.println("0~9の数字を入力してください");
			scan = new Scanner(System.in);
			num = scan.nextInt();
			if(num == ans){
				System.out.println("アタリ！");
				break;
			}
			else if(num != ans){
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します");
	}

}
