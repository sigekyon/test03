package entry;


/* 3-1
 * 1:weight == 60
 * 2:age1 + age2 > 60
 * 3:age%2 == 1
 * 4:name.equals("��")
 * 3-2
 * C,D,E
 * 3-4
 * else�߂Ɂo�p�����Ă��炸�A�\���G���[�ƂȂ��Ă��邽�߁A
 * else{
 * -��-
 * }
 * �Ƃ���B
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
		
		System.out.println("����ɂ��́B");
		if(seibetsu == 0){
			System.out.println("���͒j�ł��B");
			System.out.println(age + "�΂ł��B");
		}
		else if(seibetsu == 1){
			System.out.println("���͏��ł��B");
		}
		System.out.println("��낵�����˂������܂��B");
	}
	
	static void app5(Scanner scan){
		int selected;
		System.out.println("[���j���[]1:���� 2:�o�^ 3:�폜 4:�ύX >");
		selected=scan.nextInt();
		switch(selected){
		case 1:
			System.out.println("�������܂��B");
			break;
		case 2:
			System.out.println("�o�^���܂��B");
			break;
		case 3:
			System.out.println("�폜���܂��B");
			break;
		case 4:
			System.out.println("�ύX���܂��B");
			break;
		default:
			System.out.println("-----");
			break;
		}
	}
	
	static void app6(Scanner scan){
		int ans = new Random().nextInt(10);
		int num;
		
		System.out.println("�y�����ăQ�[���z");
		for(int cnt = 0; cnt < 5; cnt++){
			System.out.println("0~9�̐�������͂��Ă�������");
			scan = new Scanner(System.in);
			num = scan.nextInt();
			if(num == ans){
				System.out.println("�A�^���I");
				break;
			}
			else if(num != ans){
				System.out.println("�Ⴂ�܂��B");
			}
		}
		System.out.println("�Q�[�����I�����܂�");
	}

}
