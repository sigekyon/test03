package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel panel = new JPanel();
	JTextField txtFld1 = new JTextField();
	JTextField txtFld2 = new JTextField();
	JComboBox symbCbx = new SymbComboBox();
	JButton calcBtn = new CalcButton("ŒvŽZ");
	JLabel viewLbl = new JLabel();
	
	MyFrame(){
		this.setBounds(10, 10, 400, 200);
		panel.setLayout( null );
		
		txtFld1.setBounds(10, 10, 50, 20);
		panel.add(txtFld1);
		
		txtFld2.setBounds(130, 10, 50, 20);
		panel.add(txtFld2);
		
		symbCbx.setBounds(70, 10, 50, 20);
		panel.add(symbCbx);
		
		calcBtn.setBounds(10, 50, 200, 20);
		panel.add(calcBtn);
		
		viewLbl.setBounds(200, 10, 50, 20);
		viewLbl.setText("= ");
		panel.add(viewLbl);
				
		this.setContentPane( panel );
		this.setVisible(true);
	}
	
	class CalcButton extends JButton implements ActionListener{
		CalcButton(String label){
			super(label);
			this.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			doCalc();
		}
	}
	
	class SymbComboBox extends JComboBox implements ActionListener{
		SymbComboBox(){
			this.addItem("+");
			this.addItem("-");
			this.addItem("*");
			this.addItem("/");
			this.setSelectedIndex(3);
			this.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			doCalc();
		}
	}
	
	void doCalc(){
		String v;
		int v1 = Integer.valueOf(txtFld1.getText());
		int v2 = Integer.valueOf(txtFld2.getText());
		String symbol = (String) symbCbx.getSelectedItem();
		switch(symbol){
		case "+":
			v = String.valueOf(v1 + v2);
			break;
			
		case "-":
			v = String.valueOf(v1 - v2);
			break;
			
		case "*":
			v = String.valueOf(v1 * v2);
			break;
			
		case "/":
			v = String.valueOf(v1 / v2);
			break;
		default:
			v = "";
		}
		System.out.println("v = " + v);
		viewLbl.setText("= " + v);
	}



}
