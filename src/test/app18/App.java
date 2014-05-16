package test.app18;

public class App {
	public static void main(String[] args) {
		User user = new User("koyama");
		System.out.println(user.get_name());
		System.out.println(user.getName());
	}
}