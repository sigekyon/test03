package sample.dao;

public class UsrInfo {
	private String empNum;
	private String lastName;
	private String firstName;
	private String account;
	private String password;
	
	public UsrInfo() {

	}

	public UsrInfo(String empNum, String lastName, String firstName,
			String account, String password) {
		this.empNum = empNum;
		this.lastName = lastName;
		this.firstName = firstName;
		this.account = account;
		this.password = password;
	}
	
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFullName(){
		return this.lastName + "Å@" + this.firstName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
