import java.awt.*;

public class q2 {
    public static void main(String[] args){
        Frame1 f = new Frame1("Frame with Null layout");
        f.setSize(500,500);
        f.setVisible(true);
    }
}
class Frame1 extends Frame{
    Frame1(String title){
        super(title);
        setLayout(null);
        Label l1,l2,l3;
        TextField tf1,tf2;
        Button b1;
        l1 = new Label("NAME");
        l2 = new Label(("PASSWORD"));
        l3 = new Label("Please Login");
        b1 = new Button("Submit");
        tf1 = new TextField(40);
        tf2 = new TextField(40);
        add(l1);add(l2);add(l3);add(tf1);add(tf2);add(b1);
        l1.setBounds(50,50,100,50);
        tf1.setBounds(150,50,100,50);
        l2.setBounds(50,200,50,50);
        tf2.setBounds(150,200,50,50);
        b1.setBounds(100,270,50,50);
        l3.setBounds(200,270,50,50);
    }

}
