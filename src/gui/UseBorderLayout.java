package gui;

import java.awt.BorderLayout;
import javax.swing.*;

public class UseBorderLayout extends JFrame {
    private static final long serialVersionUID = 1L;

    JPanel panel = new JPanel();
    JButton button1 = new JButton( "ボタン1" );
    JButton button2 = new JButton( "ボタン2" );
    JButton button3 = new JButton( "ボタン3" );
    JButton button4 = new JButton( "ボタン4" );
    JButton button5 = new JButton( "ボタン5" );

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
        combobox1.addItem("あ");
        combobox1.addItem("い");
        combobox1.setSelectedItem("い");
        panel.add(combobox1);
        

        this.setVisible( true );
    }
}
