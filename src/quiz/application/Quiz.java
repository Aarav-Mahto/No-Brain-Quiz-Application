package quiz.application;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;

public class Quiz extends JWindow implements ActionListener {
    
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][1];
    String user_ans[][]=new String[10][1];
    JButton next,submit,lifeline;
    JLabel question,qno;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup group;
    public static int timer=15;
    public static boolean ans_given=false;
    public static int count=0,score=0;
    public static String name="User";
    
    Quiz(String username){
        this.name=username;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/quiz2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1910,1000 , Image.SCALE_DEFAULT);//380
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img1 =new JLabel(i3);
        img1.setBounds(0, 0, 1910, 380);
        add(img1);
        
        JLabel me=new JLabel("Designed & Coded by Aarav Mahto");
        me.setBounds(1100,750,350,30);
        me.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        me.setForeground(new Color(0,44,254));
        add(me);
        
        Font f1=new Font("Tahoma",Font.PLAIN,24);
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(f1);
        add(qno);
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(f1);
        add(question);
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][0] = "JDB";
        answers[1][0] = "int";
        answers[2][0] = "java.util package";
        answers[3][0] = "Marker Interface";
        answers[4][0] = "Heap memory";
        answers[5][0] = "Remote interface";
        answers[6][0] = "import";
        answers[7][0] = "Java Archive";
        answers[8][0] = "java.lang.StringBuilder";
        answers[9][0] = "Bytecode is executed by JVM";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        opt1.setFocusPainted(false);
        opt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        opt1.setBorder(null);
        add(opt1);
        opt2 = new JRadioButton();
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        opt2.setFocusPainted(false);
        opt2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        opt2.setBorder(null);
        add(opt2);
        opt3 = new JRadioButton();
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        opt3.setFocusPainted(false);
        opt3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        opt3.setBorder(null);
        add(opt3);
        opt4 = new JRadioButton();
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        opt4.setFocusPainted(false);
        opt4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        opt4.setBorder(null);
        add(opt4);
        group = new ButtonGroup();
        group.add(opt4);
        group.add(opt3);
        group.add(opt2);
        group.add(opt1);
        
        next = new JButton("Next");
        next.setBounds(1100, 510, 200, 40);
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Dialog",Font.BOLD,16));
        next.setFocusPainted(false);
        next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        next.setBorder(null);
        next.addActionListener(this);
        add(next);
        submit = new JButton("Submit");
        submit.setBounds(1100, 670, 200, 40);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Dialog",Font.BOLD,16));
        submit.setFocusPainted(false);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.setBorder(null);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 590, 200, 40);
        lifeline.setBackground(Color.BLUE);
        lifeline.setForeground(Color.WHITE);
        lifeline.setFont(new Font("Dialog",Font.BOLD,16));
        lifeline.setFocusPainted(false);
        lifeline.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lifeline.setBorder(null);
        lifeline.addActionListener(this);
        add(lifeline);
        
        setVisible(true);
        setBounds(-10,0,1920,820);
        start(count);
    }
    public void start(int count){
        qno.setText(""+(count+1)+". ");
        question.setText(questions[count][0]);
        opt1.setText(" (a) "+questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(" (b) "+questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(" (c) "+questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(" (d) "+questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        group.clearSelection();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        String time=timer+" Sec.";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        if(timer>0){
            g.drawString(time, 1100, 480);
        }
        else{
            g.drawString("Times Up !!", 1100, 480);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){e.printStackTrace();}
        
        if(ans_given){
            ans_given=false;
            timer=15;
        }
        else if(timer<0){
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){//when submit
                if(group.getSelection()==null){
                    user_ans[count][0]="";
                }
                else{
                    user_ans[count][0]=group.getSelection().getActionCommand();
                }
                //Checking answer
                for(int i=0;i<user_ans.length;i++){
                    if(user_ans[i][0].equals(answers[i][0]))
                        score+=10;
                }
                setVisible(false);
                new Scores(name,score);
            }
            else{//next at the end

                if(group.getSelection()==null){
                    user_ans[count][0]="";
                }
                else{
                    user_ans[count][0]=group.getSelection().getActionCommand();
                }
                count++;
                if(count<=9)
                    start(count);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given=true;
            if(group.getSelection()==null)
                user_ans[count][0]="";
            else{
                user_ans[count][0]=group.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }
        if(ae.getSource()==lifeline){
            if(count==2|| count==4|| count==6|| count==8|| count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
        if(ae.getSource()==submit){
            ans_given=true;
            if(group.getSelection()==null){
                    user_ans[count][0]="";
            }
            else{
                user_ans[count][0]=group.getSelection().getActionCommand();
            }
            for(int i=0;i<user_ans.length;i++){
                if(user_ans[i][0].equals(answers[i][0]))
                    score+=10;
            }
            setVisible(false);
            new Scores(name,score);
        }
        
    }
    public static void main(String[] args){
        new Quiz("user");
    }
}
