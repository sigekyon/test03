package test.app01;

public class App {

	public static void main(String[] args) {
		AppInfo appInfo = new AppInfo("サンプルアプリ", 1, 0);
		Message message = new Message(appInfo);
		message.print("Hello");
	}

}
