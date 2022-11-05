import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Frame3 f =  new Frame3("adding two numbers",a,b);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
class Frame3 extends Frame{
    Frame3(String s,String a,String b){
        super(s);
        setLayout(new FlowLayout());
        TextField tf1,tf2,tf3;
        Button b1;
        tf1 = new TextField(40);
        tf2 = new TextField(40);
        tf3 = new TextField(40);
        tf1.setText(a);tf2.setText(b);
        b1 = new Button("add");
        add(tf1,BorderLayout.NORTH);add(tf2,BorderLayout.SOUTH);add(tf3,BorderLayout.WEST);add(b1,BorderLayout.EAST);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(tf1.getText());
                int second = Integer.parseInt(tf2.getText());
                int ans = first+second;
                String s  = Integer.toString(ans);
                tf3.setText(s);
            }
        });
    }
}

