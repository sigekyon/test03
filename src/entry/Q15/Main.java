package entry.Q15;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//		throw new IOException();

		String s = "�O";
		int i;
		
		try{
			i = Integer.parseInt(s);
		}
        catch(NumberFormatException e){
            System.out.println("�������������Ȃ����߁A�����ɕϊ��ł��܂���B");
//          e.printStackTrace();
        }
		s = null;
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException��O��catch���܂���");
			System.out.println("-----�X�^�b�N�g���[�X�i��������j-----");
			e.printStackTrace();
			System.out.println("-----�X�^�b�N�g���[�X�i�����܂Łj-----");
		}
	}

}
