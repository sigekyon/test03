package entry.Q10;

public class Util {
	static String chkName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("���O��3�����ȏ�Őݒ肵�Ă��������B");
		}
		else{
			return name;
		}
	}
}
