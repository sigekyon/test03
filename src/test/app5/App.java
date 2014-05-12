package test.app5;
import java.text.Format;
import java.util.Date;
import java.text.DateFormat;
  
class App {
	String initTime;
	static int count = 0;
	{
		Date currentDate = new Date();
		Format dft = DateFormat.getDateTimeInstance();
		initTime = dft.format(currentDate);
		
		count++;
		System.out.println("count:"+count);
	}
	
	void exec() {
		System.out.println(initTime);
	}
	public static void main(String[] args)
	throws Exception {
		App app = new App(); 
		app.exec();
		Thread.sleep(1000); 
		app = new App(); 
		app.exec();
	}
}
