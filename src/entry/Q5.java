package entry;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Q5 {

	public static void main(String[] args) {
		String title = "打ち合わせの件";
		String address = "tchiba@ntc.co.jp";
		String text = "2014/5/19の17:00からに変更になりました。";
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		
		introduceOneself();
		System.out.println("\n----------\n");
		email(title,address,text);
		System.out.println("\n----------\n");
		email(address,text);
		System.out.println("\n----------\n");
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + 
		calcTriangleAres(10,5) + "cm2");
		System.out.println("\n----------\n");
		System.out.println("円の半径が" + radius + "の場合、面積は、" + calcCircleAres(radius) + "cm2");
		
	}
	//	5-1
	static void introduceOneself(){
		String name = "千葉";
		int age = 28;
		float height = 179.0F;
		char sex = '男';
		
		System.out.println("私の名前は" + name + "です。");
		System.out.println(age + "歳で、身長は" + height + "cm、性別は" + sex +"です。");
	}
	//	5-2
	static void email(String title, String address, String text){
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	//	5-3
	static void email(String address, String text){
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
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
