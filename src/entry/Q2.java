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
		String ans = "x+y��" + (x + y);
		System.out.println(ans);
	}
//	2-3
	static void app3(){
		String name = null;
		String ageString = null;
		int age = 0;
		int fortune = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�悤�����肢�̊ق�");
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		name = scan.nextLine();
		System.out.println("���Ȃ��̔N�����͂��Ă�������");
		ageString = scan.nextLine();
		age = Integer.parseInt(ageString); 
		scan.close();
		fortune = new Random().nextInt(4);
		fortune++;
		System.out.println("�肢�̌��ʂ��o�܂����I");
		System.out.println(age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune + "�ł�");
		System.out.println("1:��g 2:���g 3:�g 4:��");		
	}
	
}
