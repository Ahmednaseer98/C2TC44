package DAY28;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIApp1 extends Frame{
	Button b1,b2;
	TextField t;
	public GUIApp1() {
		setLayout(new FlowLayout());
		add(b1 = new Button("Click"));
		add(t= new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener((e)-> t.setText("Hello World"));
		b2.addActionListener((e)-> t.setText(""));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new GUIApp1();
	}
}

