package test.app20;

public class SampleApp {
	public static void main(String[] args) {
		String[] users = { "Sara", "Akira", "Akira", "Jacky", "" };
		String[] passwords = { "", "777", "111", "abc", "xyz" };
		SampleUserList sample = new SampleUserList();
		for (int i = 0; i < users.length; i++) {
			try {
				System.err.print("i=" + i + ":");
				boolean isLogin = sample.login(users[i], passwords[i]);
				if (isLogin) {
					System.err.println("���O�C���ɐ������܂����B(" + users[i] + ")");
				} else {
					System.err.println("���O�C���Ɏ��s���܂����B");
				}
			} catch (SampleException e1) {
				e1.printStackTrace();
				System.err.println("code[" + e1.getCode() + "]");
			} catch (SampleException2 e2) {
				e2.printStackTrace();
			}
			System.err.println("");
		}
	}
}
