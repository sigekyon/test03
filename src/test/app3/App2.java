package test.app3;

public class App2 {

	public static void main(String[] args) {
		AppInfo info = new AppInfo();
		info.appName = "サンプルアプリ info";
		System.out.println(info.appName);

		AppInfo.appName = "サンプルアプリ AppInfo";
		System.out.println(AppInfo.appName);
	}

}