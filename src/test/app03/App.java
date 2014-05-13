package test.app03;

public class App {

	public static void main(String[] args) {
		AppInfo.appName = "サンプルアプリ";
		AppInfo.version = 1;
		AppInfo.mode = 0;

		Message message = new Message();
		message.print("Hello");
		Calc calc = new Calc();
		calc.exec();
	}

}