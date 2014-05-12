package test.app5;

import java.text.DateFormat;
import java.text.Format;
import java.util.Date;

public class App2 {
	static String loadedTime;
	String initTime;
	static int count = 0;
	
	static{
		Date currentDate = new Date();
		Format dft = DateFormat.getDateInstance();
		loadedTime = dft.format(currentDate);
	}
	
	{
		Date correntDate = new Date();
		Format dft = DateFormat.getDateInstance();
		initTime = dft.format(correntDate);
		count++;
		System.out.println("count:" + count);
	}
	
	void exec(){
		System.out.print("L:" + loadedTime);
		System.out.println("\tI:" + initTime);
	}
	
	public static void main(String[] args)
	throws Exception {
		System.out.println("App.loadedTime:" + App2.loadedTime);
		Thread.sleep(1000);
		App app = new App();
		app.exec();
		Thread.sleep(1000);
		app = new App();
		app.exec();
	}
}
