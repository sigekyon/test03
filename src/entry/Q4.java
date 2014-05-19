package entry;

import java.util.Scanner;

public class Q4 {
//	4-1
int[] points = new int[4];
double[] weights = new double[5];
boolean[] answers = new boolean[3];
String[] names = new String[3];

	public static void main(String[] args) {
		app2();
		System.out.println("\n----------\n");
		app3();
		System.out.println("\n----------\n");
		app4();
	}
//	4-2
	static void app2(){
		int moneyList[] = {121902, 8302, 55100};
		for(int i = 0; i < moneyList.length; i++){
			System.out.println(moneyList[i]);
		}
		for(int i2 : moneyList){
			System.out.println(i2);
		}
		moneyList=null;
	}
//	4-3
	static void app3(){
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
//		System.out.println(counts[1]); => java.lang.NullPointerException
//		System.out.println(heights[2]); => java.lang.ArrayIndexOutOfBoundsException
	}
//	4-4
	static void app4(){
		int[] numbers = {3, 4, 9};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1Œ…‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		int input = scan.nextInt();
		for(int num : numbers){
			if(num == input){
				System.out.println("ƒAƒ^ƒŠI");
			}
		}
		scan.close();
		
		
	}
}
