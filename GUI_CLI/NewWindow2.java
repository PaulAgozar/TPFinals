package tpfinals5;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow2 {
    JLabel label = new JLabel();
    JFrame frame = new JFrame();
    
    NewWindow2(){
    
    label.setBounds(50,0,100,100);
    label.setFont(new Font(null,Font.PLAIN,25));
    label.setText("Patient Section");  
    
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,500);
    frame.setLayout(null);
    frame.setVisible(true);
        
    }      
    }