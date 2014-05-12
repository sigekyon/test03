package test.app1;

public class Message {
	AppInfo appInfo;
	Message(AppInfo a){
		appInfo = a;
	}
	
	void print(String message){
		System.out.println("[" + appInfo.appName + "]");
		System.out.println(message);
	}
}
