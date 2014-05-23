package entry.Q14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		Account a = m.new Account();
		
		c.setTime(now);
		c.set(c.DAY_OF_MONTH,c.DAY_OF_MONTH + 100);
		Date future = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("¼—ïyyyy”NMMŒdd“ú");
		
		System.out.println(f.format(future));
		System.out.println(a);
	}
	
	public class Account{
		String accountNumber = "4649";
		int balance = 1592;
		
		public String toString(){
			return "\\" + this.balance + "(ŒûÀ”Ô†=" + this.accountNumber + (")");
		}
		public boolean equals(Object o){
			if(this == o){
				return true;
			}
			if(o instanceof Account){
				Account a = (Account) o;
				String a1 = (a.accountNumber).trim();
				String a2 = this.accountNumber.trim();
				if(a1 == a2 || a1.equals(a2)){
					return true;
				}
				else{
					return false;
				}
			}
			else return false;
		}
	}

}
