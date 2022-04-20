package DAY34;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo7 extends Applet {
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1=new Button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(focusEvent e) {
				//TODO Auto-generated method stub
				t.setText("");
			}
			public void focusLost(FocusEvent e) {
				//TODO Auto-generated method stub
			}
		});
	}
}
