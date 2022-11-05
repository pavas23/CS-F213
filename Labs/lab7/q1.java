import java.awt.*;
import java.awt.event.*;

public class q1 {
    public static void main(String[] args){
        frame4 f  =  new frame4("hello");
        f.setSize(500,500);
        f.setVisible(true);
    }
}
class frame4 extends Frame{
    int x = 0;
    frame4(String s){
        super(s);
        setLayout(new FlowLayout());
        Label l;
        final TextField tf;
        Button b;
        l = new Label("Counter");
        b = new Button("Count");
        tf = new TextField(20);
        tf.setEnabled(false);
        add(l);add(tf);add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = x + 1;
                tf.setText(Integer.toString(x));
            }
        });
    }
}


