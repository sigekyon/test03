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
        
        button1.setText("�{�^��");
        panel.add(button1);
        
        checkbox1.setText("�`�F�b�N�{�b�N�X");
        panel.add(checkbox1);

        textarea1.setText("�e�L�X�g�G���A\nTextArea");
        panel.add(textarea1);

        combobox1.addItem("���");
        combobox1.addItem("�݂���");
        combobox1.addItem("�Ȃ�");
        panel.add(combobox1);
        
        this.setContentPane(panel);
        this.setVisible(true);
    }
}
