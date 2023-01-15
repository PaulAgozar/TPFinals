package tpfinals5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LaunchPage extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Welcome to Hospital Information System!");
    JLabel wel = new JLabel();
    JButton doc = new JButton("Doctors");
    JButton pat = new JButton("Patients");
    
    LaunchPage(){
        wel.setText("Main Menu");
        wel.setBounds(160,0,150,100);
        wel.setFont(new Font(null,Font.PLAIN,25));
        wel.setVerticalTextPosition(JLabel.TOP);
        wel.setVerticalAlignment(JLabel.TOP);
        wel.setHorizontalTextPosition(JLabel.CENTER);
        
        frame.add(wel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        
        doc.setBounds(120,60,200,40);
        doc.setFocusable(false);
        doc.addActionListener(this);
        
        frame.add(doc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        
        pat.setBounds(120,130,200,40);
        pat.setFocusable(false);
        pat.addActionListener(this);
        
        frame.add(pat);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == doc){
            doctors doc = new doctors();
        }
        
        else if (e.getSource() == pat){
            patients pat = new patients();
        }
    }
}
