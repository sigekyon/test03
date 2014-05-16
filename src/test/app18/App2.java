package test.app18;

import java.util.List;

public class App2 {
	private UserManager um = new UserManager();
	public void exec() {
		User user = new User("koyama");
		um.add(user);
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>)um.getList();
		User u = list.get(0);
		System.out.println(u);
	}
	public static void main(String[] args) {
		App2 app = new App2();
		app.exec();
	}
}
