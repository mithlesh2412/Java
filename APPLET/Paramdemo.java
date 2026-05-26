//passing parameters to the applets in java
import java.applet.*;
import java.awt.*;


public class Paramdemo extends Applet {
    String name;

    public void init(){
        name = getParameter("Username");

    }
    public void paint("Graphics g"){
        g.drawString(
            "welcome"+name,50,100
        );
    }
}
