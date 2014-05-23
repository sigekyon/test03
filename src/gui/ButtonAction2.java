package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonAction2 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane = new JPanel();
	JButton activeButton, noActionButton;
	JTextArea messages;

	public ButtonAction2() {

		this.setBounds(0, 0, 700, 300);
		this.setTitle("�{�^�����N���b�N�����");

		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.white);

		activeButton = new JButton("�L������");
		activeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton(e);
			}
		});

		contentPane.add(activeButton);

		noActionButton = new JButton("�������Ȃ�");
		contentPane.add(noActionButton);

		messages = new JTextArea("���b�Z�[�W�J�n\n", 12, 60);
		messages.setLineWrap(true);
		messages.setBackground(Color.green);
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

	public void clickButton(ActionEvent e) {
		System.out.println("Action�C�x���g���������܂����B");

		StringBuffer currentText = new StringBuffer(messages.getText());
		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * alfabets.length);
			currentText.append(alfabets[index]);
		}
		currentText.append(" ");
		messages.setText(currentText.toString());
	}

}
