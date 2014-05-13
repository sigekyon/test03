package test.app08;

public class App2 {

	public static void main(String[] args) {
		UserInfo u = new UserInfo();
		u.name = "taro";
		u.eMail = u.name + "@example.jp";
		UserInfoManager2 manager = new UserInfoManager2();
		manager.userInfoArray.add(u);
		UserInfo u0 = (UserInfo)manager.userInfoArray.get(0);
		System.out.println(u0.name);
		System.out.println(u0.eMail);
	}

}
