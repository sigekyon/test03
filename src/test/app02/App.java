package test.app02;

public class App {

	public static void main(String[] args) {
		AppInfo appInfo = new AppInfo("�T���v���A�v��", 1, 0);
		Message message = new Message(appInfo);
		message.print("Hello");
		Calc calc = new Calc();
		calc.exec(appInfo);
	}

}
