package entry.Q15;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//		throw new IOException();

		String s = "三";
		int i;
		
		try{
			i = Integer.parseInt(s);
		}
        catch(NumberFormatException e){
            System.out.println("書式が正しくないため、数字に変換できません。");
//          e.printStackTrace();
        }
		s = null;
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("-----スタックトレース（ここから）-----");
			e.printStackTrace();
			System.out.println("-----スタックトレース（ここまで）-----");
		}
	}

}
