
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener
{
    Score(String name , int score)
    {
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel qn = new JLabel("Thankyou"  );
        qn.setBounds(45,30,700,30);
        qn.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(qn);
        
        JLabel scor = new JLabel("Your Score is "+ score );
        scor.setBounds(350,200,300,30);
        scor.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(scor);
        
        JButton b2= new JButton("Play Again");
        b2.setBounds(380,270,100,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
       
    }
    public void actionPerformed(ActionEvent e)
    {
        
        
            setVisible(false);
            new Login("user");
    
        
    }
    public static void main(String[] args)
    {
        new Score("user",0);
    }
}
