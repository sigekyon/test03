package test.app20;

public class SampleUserList {
	class UserInfo {
		private String name;
		private String password;
		public UserInfo(String name, String password) {
			this.name = name;
			this.password = password;
		}
		public String getName() { return name; }
		public String getPassword() { return password; }
	}

	private java.util.List<UserInfo> users = 
		new java.util.ArrayList<UserInfo>();

	public SampleUserList() {
		users.add(new UserInfo("Akira", "777"));
		users.add(new UserInfo("Jacky", "*"));
	}
  
	public boolean login(String name, String password)
	throws SampleException, SampleException2 {
		for (UserInfo user : users) {
			if ("".equals(name.trim())) {
				throw new SampleException(1, "���O�C���Ɏ��s���܂����B");
			} else if ("".equals(password.trim())) {
				throw new SampleException(2, "���O�C���Ɏ��s���܂����B");
			}
			if (user.getName().equals(name)) {
				if (user.getPassword().equals("*")) {
					throw new SampleException2("���O�C���Ɏ��s���܂����B");
				} else if (user.getPassword().equals(password)) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

}
