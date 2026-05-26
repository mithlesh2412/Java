//JBUTTON - it is used to create clicable button 
import javax.swing.*;

public class JButtondemo {
    public static void main(String[] args){
        JFrame f = new JFrame();

        JButton b = new JButton("Clicke me");

        b.setBounds(100,100,100,40);
        f.add(b);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
