
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    JButton b1,b2;
    String name;
    Login(String name)
    {
        super("QUIZ APPLICATION");
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel l1= new JLabel("       Login");
        l1.setBounds(750,60,300,45);
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        add(l1);
        
        JLabel l2= new JLabel("Enter your Name");
        l2.setBounds(810,150,300,20);
        l2.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
        add(l2);
        
        JTextField t1=new JTextField();
        t1.setBounds(735,200,300,25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t1);
        
        b1= new JButton("START");
        b1.setBounds(735,270,120,25);
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2= new JButton("EXIT");
        b2.setBounds(915,270,120,25);
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            setVisible(false);
            new Quiz(name);
        }
        if(e.getSource()==b2)
        {
            System.exit(0);
        }
    }
    
    public static void main(String[] args)
    {
        new Login("user");
    
    }
}
