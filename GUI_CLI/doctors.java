package tpfinals5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class doctors extends JFrame implements ActionListener{
    JFrame dframe = new JFrame("Doctors Section");
    JLabel label = new JLabel();
    JLabel l1 = new JLabel();
    JPanel p1 = new JPanel();
    JButton b1 = new JButton("Add New Entry");
    JButton b2 = new JButton("Existing Doctors List");
    JButton b3 = new JButton("Back");
    
    doctors(){
        
        b1.setBounds(40,70,200,40);
        b1.setFocusable(false);
        b1.addActionListener(this);
        
        dframe.add(b1);
        dframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dframe.setSize(420,400);
        dframe.setLayout(null);
        dframe.setVisible(true);
        dframe.setResizable(false);
        
        b2.setBounds(300,70,200,40);
        b2.setFocusable(false);
        b2.addActionListener(this);
        
        dframe.add(b2);
        dframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dframe.setSize(420,400);
        dframe.setLayout(null);
        dframe.setVisible(true);
        dframe.setResizable(false);
        
        b3.setBounds(230,150,80,40);
        b3.setFocusable(false);
        b3.addActionListener(this);
        
        dframe.add(b3);
        dframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dframe.setSize(420,400);
        dframe.setLayout(null);
        dframe.setVisible(true);
        dframe.setResizable(false);
        
        p1.setBackground(null);
        p1.setBounds(0, 0, 580, 100);
        p1.setLayout(new BorderLayout());
        
        label.setText("Doctors Section");
        label.setBounds(0,0,200,300);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.LEFT);

        dframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dframe.setLayout(null);
        dframe.setSize(570,250);
        dframe.setVisible(true);
        dframe.add(p1);
        dframe.setResizable(false);
        p1.add(label);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            options opt = new options();
        }
        else if(e.getSource() == b2){
            doctor2 doc2 = new doctor2();
        }
        
        else if(e.getSource() == b3){
            LaunchPage lp = new LaunchPage();
        }
        }
    }