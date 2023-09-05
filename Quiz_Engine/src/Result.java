import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener{
    String name;
    Result(String name, int score){
        this.name=name;
        setBounds(400,150,750,550);
        getContentPane().setBackground(new Color(144,192,238));
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        i1.setImage(i1.getImage().getScaledInstance(750,200,Image.SCALE_SMOOTH));
        JLabel img= new JLabel(i1);
        img.setBounds(0,0,750,200);
        add(img);
      ImageIcon i2= new ImageIcon(ClassLoader.getSystemResource("icons/high.jpg"));
      i2.setImage(i2.getImage().getScaledInstance(300,350,Image.SCALE_SMOOTH));
        JLabel image= new JLabel(i2);
        image.setBounds(0,200,300,350);
        add(image);
        JLabel head=new JLabel("Thanks. The Quiz Show is over.");
        head.setBounds(320,220,300,40);
        head.setFont(new Font("Times New Roman", Font.BOLD, 17));
        add(head);

        JLabel res=new JLabel("Score= "+ score);
        res.setBounds(320,285,310,40);
        res.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(res);

        JButton rules=new JButton("RETAKE");
        rules.setBounds(400,360,120,30);
        rules.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(rules);
        rules.addActionListener(this);

        setVisible(true);
    }
    public static void main(String[] args){
        new Result("User", 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     setVisible(false);
     new Login();
    }
}
