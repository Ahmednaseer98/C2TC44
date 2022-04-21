package DAY35;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Applet3 extends Frame{
	Button b1,b2;
	TextField t;
	public Applet3 {
		setLayout(new FlowLayout());
		add(b1= new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t.setText("HelloWorld");
			}
		});
		b2.addActionListener(new ActionListener() {
			addWindowListener(new WindowAdapter()
					{
				@override
				public void Windowclosing(WindowEvent e)
				System.exit(0);
					}
					});
			setSize(300,300);
			setVisibile(true);
	}
	public static void main(String[] args) {
		new Applet1();
		@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t.setText("");
			}
		});
	}

}


