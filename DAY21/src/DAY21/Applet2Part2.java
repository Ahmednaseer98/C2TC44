package DAY21;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part2 extends Applet implements ActionListener {
	Button b1,b2;
	TextField t;
	public void init() {//override
		add(b1= new Button("Click"));
		add(t = new TextField(15));
		add(b2= new Button("Clear"));
		b1.addActionListener(this);
		//A a =new A();
		b2.addActionListener(new A());
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		t.setText("Hello World");
	}
	class A implements ActionListener{
		/*public A() {
			b2.addActionListener(this);
		}*/

		public void actionPerformed(ActionEvent e) {//implement
			// TODO Auto-generated method stub
			t.setText("");
		}
		
	}
	
}


