package test.app18;

public class User {
	private String name;
	public User(String name) {
		this.name = name;
	}
	@Deprecated
	public String get_name() { return getName(); }
	public String getName() { return name; }
}