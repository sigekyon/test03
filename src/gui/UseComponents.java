package gui;

import javax.swing.*;

public class UseComponents extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JPanel panel = new JPanel();
    JButton button1 = new JButton();
    JCheckBox checkbox1 = new JCheckBox();
    JTextArea textarea1 = new JTextArea();
    JComboBox combobox1 = new JComboBox();
    
    public UseComponents(){
        this.setBounds(50, 100, 400, 250);
        
        button1.setText("ボタン");
        panel.add(button1);
        
        checkbox1.setText("チェックボックス");
        panel.add(checkbox1);

        textarea1.setText("テキストエリア\nTextArea");
        panel.add(textarea1);

        combobox1.addItem("りんご");
        combobox1.addItem("みかん");
        combobox1.addItem("なし");
        panel.add(combobox1);
        
        this.setContentPane(panel);
        this.setVisible(true);
    }
}
