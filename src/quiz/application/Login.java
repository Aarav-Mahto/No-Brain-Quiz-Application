package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton back,rules;
    JTextField pname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/login1.png"));
        Image i2 = i1.getImage().getScaledInstance(630, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img1 =new JLabel(i3);
        img1.setBounds(0, 0, 630, 700);
        add(img1);
        JLabel heading=new JLabel("No Brains Quiz");
        heading.setBounds(750,120,300,45);
        heading.setFont(new Font("ALGERIAN",Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel me=new JLabel("Designed & Coded by Aarav Mahto");
        me.setBounds(800,550,350,30);
        me.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        me.setForeground(new Color(0,44,254));
        add(me);
        
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810,200,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);
        pname = new JTextField();
        pname.setBounds(735,250,300,30);
        pname.setFont(new Font("Mongolian Baiti",Font.BOLD,19));
        add(pname);
        rules = new JButton("Go");
        rules.setBounds(735, 320, 120, 30);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.setFont(new Font("Mongolian Baiti",Font.BOLD,16));
        rules.setFocusPainted(false);
        rules.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rules.setBorder(null);
        rules.addActionListener(this);
        add(rules);
        back = new JButton("Back");
        back.setBounds(915, 320, 120, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Mongolian Baiti",Font.BOLD,16));
        back.setFocusPainted(false);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBorder(null);
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
        setSize(1200,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            dispose();
        }
        if(ae.getSource()==rules){
            String name=pname.getText().trim();
            if(name.equals("")|| name.equals("Enter Your Name")){
                pname.setText("Enter Your Name");
            }
            else{
                setVisible(false);
                new Rules(name);
            }
        }
    }
    
    
    public static void main(String[] args){
        new Login();
    }
}
