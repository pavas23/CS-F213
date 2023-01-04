import java.awt.*;
import java.awt.event.*;

public class q4 {
    public static void main(String[] args){
        Frame2 f2 = new Frame2("Label display");
        f2.setSize(500,500);
        f2.setVisible(true);
    }
}
class Frame2 extends Frame{
    Frame2(String s){
        super(s);
        addWindowListener(new WL());
        setLayout(new FlowLayout());
        TextField tf;
        Button b1,b2;
        tf = new TextField(50);
        b1 = new Button("First");
        b2 = new Button("Second");
        add(tf);add(b1);add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("First");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("second");
            }
        });
    }
    class WL extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.out.println("Window is closing");
            System.exit(0);
        }
    }
}