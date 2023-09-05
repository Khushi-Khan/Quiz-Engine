import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener {
     JButton rules,back;
     JTextField tfname;
    Login() {
        getContentPane().setBackground(new Color(144,192,238));
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/log.jpg"));
        JLabel image= new JLabel(i1);
        setLayout(null);
        image.setSize(600,500);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel head=new JLabel("QUIZ TIME!");
        head.setBounds(750,60,300,45);
        head.setFont(new Font("Times New Roman", Font.BOLD, 40));
        add(head);
        JLabel name=new JLabel("Enter Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(name);

        tfname= new JTextField();
        tfname.setBounds(735,200,300,20);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules=new JButton("RULES");
        rules.setBounds(735,270,120,25);
        rules.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(rules);
        back=new JButton("BACK");
        back.setBounds(915,270,120,25);
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(back);
        rules.addActionListener(this);
        back.addActionListener(this);

        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==rules){
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);

        }else if(e.getSource()==back){
          setVisible(false);

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}


