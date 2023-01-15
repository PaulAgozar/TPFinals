package tpfinals5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class patients{
    JFrame frame = new JFrame("Patients Section");
    JLabel label = new JLabel();
    JLabel l1 = new JLabel();
    JPanel p1 = new JPanel();
    JButton b1 = new JButton("Add New Entry");
    JButton b2 = new JButton("Existing Patients List");
    JButton b3 = new JButton("Back");
    
    patients(){
        
        b1.setBounds(40,70,200,40);
        b1.setFocusable(false);
        
        frame.add(b1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        
        b2.setBounds(300,70,200,40);
        b2.setFocusable(false);
        
        frame.add(b2);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        
        b3.setBounds(230,150,80,40);
        b3.setFocusable(false);
        
        frame.add(b3);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        
        p1.setBackground(null);
        p1.setBounds(0, 0, 580, 100);
        p1.setLayout(new BorderLayout());
        
        label.setText("Patients Section");
        label.setBounds(0,0,200,300);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.LEFT);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(570,250);
        frame.setVisible(true);
        frame.add(p1);
        frame.setResizable(false);
        p1.add(label);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            patient pati = new patient();
        }
        else if(e.getSource() == b2){
            
        }
        
        else if(e.getSource() == b3){
            LaunchPage lp2 = new LaunchPage();
        }
    }
}