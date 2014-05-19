package entry;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Q5 {

	public static void main(String[] args) {
		String title = "�ł����킹�̌�";
		String address = "tchiba@ntc.co.jp";
		String text = "2014/5/19��17:00����ɕύX�ɂȂ�܂����B";
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		
		introduceOneself();
		System.out.println("\n----------\n");
		email(title,address,text);
		System.out.println("\n----------\n");
		email(address,text);
		System.out.println("\n----------\n");
		System.out.println("�O�p�`�̒�ӂ̒�����" + bottom + "cm�A������" + height + "cm�̏ꍇ�A�ʐς�" + 
		calcTriangleAres(10,5) + "cm2");
		System.out.println("\n----------\n");
		System.out.println("�~�̔��a��" + radius + "�̏ꍇ�A�ʐς́A" + calcCircleAres(radius) + "cm2");
		
	}
	//	5-1
	static void introduceOneself(){
		String name = "��t";
		int age = 28;
		float height = 179.0F;
		char sex = '�j';
		
		System.out.println("���̖��O��" + name + "�ł��B");
		System.out.println(age + "�΂ŁA�g����" + height + "cm�A���ʂ�" + sex +"�ł��B");
	}
	//	5-2
	static void email(String title, String address, String text){
		System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂����B");
		System.out.println("����:" + title);
		System.out.println("�{��:" + text);
	}
	//	5-3
	static void email(String address, String text){
		System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂����B");
		System.out.println("����:����");
		System.out.println("�{��:" + text);
	}
	//	5-4
	static double calcTriangleAres(double bottom, double height){
		double triangleArea = (bottom * height)/2;
		return triangleArea;		
	}
	static double calcCircleAres(double radius){
		double circleArea = new BigDecimal(Math.pow(radius,2) * Math.PI).
				setScale(1,RoundingMode.FLOOR).doubleValue();
		return circleArea;		
	}
	
}
