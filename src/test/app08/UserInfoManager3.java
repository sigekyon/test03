package test.app08;

public class UserInfoManager3 {
	private UserInfo[] userInfoArray = new UserInfo[10];
	private int current = 0;

	public void add(UserInfo userInfo) {
		if (current < userInfoArray.length) {
			userInfoArray[current] = userInfo;
			current++;
		}
	}
	
	public UserInfo get(int id) {
		return userInfoArray[id];
	}
	
	public String getUserName(int id) {
		return get(id).name;
	}
	
	public String getUserEmail(int id) {
		return get(id).eMail;
	}
}
