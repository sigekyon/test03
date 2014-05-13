package test.app08;

public class App3 {

	public static void main(String[] args) {
		UserInfo u = new UserInfo();
		u.name = "taro";
		u.eMail = u.name + "@example.jp";
		UserInfoManager3 manager = new UserInfoManager3();
		manager.add(u);
		System.out.println(manager.getUserName(0));
		System.out.println(manager.getUserEmail(0));

//		manager.userInfoArray.add(u);
//		System.out.println(manager.userInfoArray.get(0).name);
//		System.out.println(manager.userInfoArray.get(0).eMail);
//		test.app08.UserInfo u1 = new test.app08.app1.UserInfo();
		
	}

}
