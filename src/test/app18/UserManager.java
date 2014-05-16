package test.app18;

import java.util.ArrayList;
import java.util.List;
  
public class UserManager {
	private List list = new ArrayList();
	public List getList() { return list; }
	public void add(Object user) { list.add(user); }
	public Object get(int index) { return list.get(index); }
	public void remove(int index) { list.remove(index); }
}