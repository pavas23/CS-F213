import java.awt.*;
import java.awt.event.*;

public class q3 {
    public static void main(String[] args){
        CloseFrame cf = new CloseFrame("bye bye");
        cf.setSize(400,400);
        cf.setVisible(true);

    }
}

class CloseFrame extends Frame{
    CloseFrame(String title){
        super(title);
        addWindowListener(new WL());
    }
    class WL extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.out.println("Window closing!!");
            System.exit(0);
        }
    }
}

