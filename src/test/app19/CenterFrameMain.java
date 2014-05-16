package test.app19;

public class CenterFrameMain {
	public static void main(String[] args) {
		CenterFrame f = new CenterFrame();
		f.setSize(800, 600);
		if (f.locateToCenter(1024, 768)) {
			f.setVisible(true);
		} else {
			System.out.println("800x600 Error");
		}
		CenterFrame f2 = new CenterFrame();
		f2.setSize(1600, 1200);
		if (f2.locateToCenter(1024, 768)) {
			f2.setVisible(true);
		} else {
			System.out.println("1600x1200 Error");
		}
	}
}