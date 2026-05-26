//JLABEL - it is used to display text or image
import javax.swing.*;

public class JLabeldemo {
    public static void main(String[] args){
        JFrame f = new JFrame();
        JLabel l = new JLabel("welcome to java");

        l.setBounds(100,100,150,300);
        f.add(l);


        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
