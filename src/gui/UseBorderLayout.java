package gui;

import java.awt.BorderLayout;
import javax.swing.*;

public class UseBorderLayout extends JFrame {
    private static final long serialVersionUID = 1L;

    JPanel panel = new JPanel();
    JButton button1 = new JButton( "�{�^��1" );
    JButton button2 = new JButton( "�{�^��2" );
    JButton button3 = new JButton( "�{�^��3" );
    JButton button4 = new JButton( "�{�^��4" );
    JButton button5 = new JButton( "�{�^��5" );

    public UseBorderLayout()    {
        this.setBounds( 80, 120, 500, 300 );
        panel.setLayout( new BorderLayout() );
        this.setContentPane( panel );

        panel.add( button1, BorderLayout.NORTH );
        panel.add( button2, BorderLayout.SOUTH );
        panel.add( button3, BorderLayout.WEST );
        panel.add( button4, BorderLayout.EAST );
        panel.add( button5, BorderLayout.CENTER );
        
        JComboBox combobox1 = new JComboBox();
        combobox1.addItem("��");
        combobox1.addItem("��");
        combobox1.setSelectedItem("��");
        panel.add(combobox1);
        

        this.setVisible( true );
    }
}
