package test.app3;

public class App2 {

	public static void main(String[] args) {
		AppInfo info = new AppInfo();
		info.appName = "�T���v���A�v�� info";
		System.out.println(info.appName);

		AppInfo.appName = "�T���v���A�v�� AppInfo";
		System.out.println(AppInfo.appName);
	}

}