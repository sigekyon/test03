package test.app19;

import javax.swing.JFrame;

public class CenterFrame extends javax.swing.JFrame {
	public CenterFrame() {
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	}
	public boolean locateToCenter(int width, int height) {
		if (width <= getSize().width || height <= getSize().height) {
			return false;
		}
		setLocation((width-getSize().width)/2, (height-getSize().height)/2);
		return true;
	}
}