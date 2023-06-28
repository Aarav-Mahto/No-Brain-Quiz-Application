package quiz.application;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener {
    JButton back,start;
    String name="user";
    Rules(String nm){
        this.name=nm;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel rules=new JLabel("Welcome "+nm+" To No Brains Quiz");
        rules.setBounds(50,20,700,30);
        rules.setFont(new Font("ALGERIAN",Font.BOLD,30));
        rules.setForeground(new Color(30,44,254));
        add(rules);
        
        JLabel me=new JLabel("Designed & Coded by Aarav Mahto");
        me.setBounds(500,580,350,30);
        me.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        me.setForeground(new Color(0,44,254));
        add(me);
        
        
        JLabel text=new JLabel();
        text.setBounds(50,100,700,420);
        text.setFont(new Font("Tahoma",Font.PLAIN,16));
        text.setText(
            "<html>"+
            "1. Only Single participation is allowed."+"<br><br>"+
            "2. The medium of the questions will be only English."+"<br><br>"+
            "2. There will be no screening round."+"<br><br>"+
            "3. All the participants can play all the rounds."+"<br><br>"+
            "4. The score derived from the current played rounds, will be declared."+"<br><br>"+
            "5. There will be certain time span for each Quiz."+"<br><br>"+
            "6. Each question contains 10 marks for right anser and 0 marks for wrong or not answered questions."+"<br><br>"+
            "7. All the rights related with the competition are reserved to "+"<b>"+"Admin ("+"<i>"+"AaravMahto"+"</i>"+")"+"</b>"+"<br><br>"+
            "8. Rules and Regulations can be change on time which will depend upon circumstances and number of Entries."+
            "</html>"
        );
        add(text);
        
        start = new JButton("Start");
        start.setBounds(400, 520, 100, 25);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.setFocusPainted(false);
        start.setCursor(new Cursor(Cursor.HAND_CURSOR));
        start.setBorder(null);
        start.addActionListener(this);
        add(start);
        back = new JButton("Back");
        back.setBounds(250, 520, 100, 25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.setFocusPainted(false);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBorder(null);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        setSize(800,650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
    }
    public static void main(String[] args){
        new Rules("Users");
    }
}
