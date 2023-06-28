package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scores extends JFrame implements ActionListener {
    JButton submit,exit;
    Scores(String name,int score){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img1 =new JLabel(i3);
        img1.setBounds(20, 180, 300, 250);
        add(img1);
        
        JLabel me=new JLabel("Designed & Coded by Aarav Mahto");
        me.setBounds(450,450,350,30);
        me.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        me.setForeground(new Color(0,44,254));
        add(me);
        
        JLabel heading = new JLabel("Thankyou "+name+" For Playing No Brains Quiz");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("ALGERIAN",Font.PLAIN,24));
        add(heading);
        
        JLabel result = new JLabel("Your Score is:  "+score);
        result.setBounds(400, 220, 300, 30);
        result.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(result);
        submit = new JButton("Play Again");
        submit.setBounds(410, 300, 150, 30);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Dialog",Font.BOLD,20));
        submit.setBorder(null);
        submit.setFocusPainted(false);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.addActionListener(this);
        add(submit);
        exit = new JButton("Close");
        exit.setBounds(410, 360, 150, 30);
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Dialog",Font.BOLD,20));
        exit.setFocusPainted(false);
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.setBorder(null);
        exit.addActionListener(this);
        add(exit);
        
        setVisible(true);
        setSize(750,550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            new Login();
            setVisible(false);
        }
        if(ae.getSource()==exit){
            dispose();
        }
    }
    public static void main(String[] args){
        new Scores("user",0);
    }
}
