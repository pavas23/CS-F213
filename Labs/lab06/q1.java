import java.awt.*;

public class q1 {
    public static void main(String[] args){
        PavasFrame f = new PavasFrame("My Frame");
        f.setSize(1000,1000);
        f.setVisible(true);
    }
}
class PavasFrame extends Frame{
    Label l;
    TextField tf;
    Button b1;
    Checkbox c1,c2,c3;
    Choice ch;
    TextArea ta;
    List li;
    PavasFrame(String title){
        super(title);
        setLayout(new FlowLayout());
        // Flow layout is very useful to prevent overflow of components in the frame container
        // as if we change the screen size the components gets adjusted automatically to the next line
        // without any overflow outside the frame.
        l = new Label("Buttons");
        tf = new TextField(40);
        b1 = new Button("ONE");
        c1 = new Checkbox("book");
        c2 = new Checkbox("bag");
        c3 = new Checkbox("laptop");
        ch = new Choice();
        ch.add("OS");ch.add("Windows");ch.add("Mac");ch.add("Linux");
        ta = new TextArea(20,40);
        li = new List();
        li.add("Pavas");li.add("Dev");li.add("one");
/*
        when using flow layout no need to setBounds for each component as it automatically sets
        location of the components in the given frame.If we add dimensions also then also no difference
        as it will set automatically.
        l.setBounds(500000,100,50,50);
        tf.setBounds(110,100,70,50);
        b1.setBounds(190,100,30,50);
        c1.setBounds(230,100,30,50);
        c2.setBounds(270,100,30,50);
        c3.setBounds(310,100,30,50);
        ch.setBounds(360,100,40,50);
        ta.setBounds(100,250,50,50);
        li.setBounds(200,250,50,50);
*/
        add(l);add(tf);add(b1);add(c1);add(c2);add(c3);add(ch);add(ta);add(li);
    }
}

