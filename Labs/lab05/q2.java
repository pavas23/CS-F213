import java.awt.*;
import java.awt.event.*;

class FirstFrame extends Frame {
	Button b1, b2;

	public FirstFrame() {
		addWindowListener(new WL());
	}

	class WL extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.out.println("Window Closing");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Frame f = new FirstFrame();
		f.setSize(200, 300); // (w,h);
		f.setVisible(true);
	}
}
