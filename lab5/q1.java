import java.awt.*;
import java.awt.event.*;
class PavasFrame extends Frame{
	Button b1,b2,b3;
	Label l;
	PavasFrame(String s){
		super(s); // super class constructor
		setLayout(new FlowLayout());
		b1 = new Button("ONE");
		b2 = new Button("TWO");
		b3 = new Button("THREE");
		l = new Label();
		l.setText("Buttons");
		add(l); add(b1); add(b2); add(b3);		
	}
	public static void main(String[] args){
		PavasFrame pf = new PavasFrame("Pavas Frame");
		pf.setSize(500,500);
		pf.setVisible(true);
	}
}

 