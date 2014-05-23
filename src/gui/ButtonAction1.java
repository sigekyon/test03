package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonAction1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JPanel contentPane = new JPanel();
	JButton activeButton, noActionButton;
	JTextArea messages;
	
	public ButtonAction1() {
	this.setBounds(0 ,0, 800, 300);
	this.setTitle("ボタンをクリックすると");

	contentPane.setLayout(new FlowLayout());
	contentPane.setBackground(Color.white);

	activeButton = new JButton("記入する");
	activeButton.addActionListener(this);
	contentPane.add(activeButton);

	noActionButton = new JButton("何もしない");
	noActionButton.addActionListener(this);
	contentPane.add(noActionButton);

	messages = new JTextArea("メッセージ開始\n", 12, 60);
	messages.setLineWrap(true);
	messages.setBackground(Color.orange);
	contentPane.add(messages);

	this.setContentPane(contentPane);
	this.setVisible(true);
	}
	
	private String alfabets[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
			"9" };
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Actionイベントが発生しました。");
		System.out.println(e.getActionCommand());
		System.out.println(e.getID());
		System.out.println(e.getModifiers());
		System.out.println(e.getSource());
		StringBuffer currentText = new StringBuffer(messages.getText());
		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * alfabets.length);
			currentText.append(alfabets[index]);
		}
		currentText.append(" ");
		messages.setText(currentText.toString());
	}
}
