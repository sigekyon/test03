package entry.Q10;

public class Util {
	static String chkName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("名前は3文字以上で設定してください。");
		}
		else{
			return name;
		}
	}
}
