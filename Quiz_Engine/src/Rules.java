import javax.print.MultiDocPrintService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    JButton back,start;
    String name;
    Rules(String name){
        this.setName(name);
        getContentPane().setBackground(new Color(144,192,238));
        JLabel head=new JLabel("Welcome  " + name + "  Read the rules before clicking start");
        head.setBounds(50,20,700,30);
        head.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(head);

        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,300);
        rules.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        rules.setText(
                "<html>" +
                "1. The quizzes consists of questions carefully designed to help you self-assess your comprehension of JAVA." + "<br><br>" +

                "2. Each question in the quiz is of multiple-choice format." + "<br><br>" +

                        "3. Read each question carefully, and click on the button as per your response." + "<br><br>" +

                "4. After responding to a question, click on 'Next' for the next question and click on 'Submit' on the top of the window to submit the quiz." + "<br><br>" +

                "5. On retaking the quiz, each time the questions will be randomized." + "<br><br>" +

                "6. There is a 15 seconds timer for each question."+ "<br><br>" +

                        "7. You can use HINT only once." + "<br><br>" +

                " 8. The total score for the quiz is based on your responses to all questions." + "<br><br>"
                + "<html>"
        );
        add(rules);
        back=new JButton("BACK");
        back.setBounds(250,500,100,30);
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(back);
        start=new JButton("START");
        start.setBounds(400,500,100,30);
        start.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(start);
        back.addActionListener(this);
        start.addActionListener(this);
        setLayout(null);
        setSize(800,650);
        setLocation(350,150);
        setVisible(true);
    }
    public static void main(String args[]){
    new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }else if(e.getSource()==back){
            setVisible(false);
            new Login();
        }
    }
}
