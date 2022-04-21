package DAY35;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Applet1 extends Frame implements ActionListener{
	Button b1,b2;
	TextField t;
	public Applet1() {
		setLayout(new FlowLayout());
		add(b1= new Button("Click"));
		add(t = new TextField(15));
		add(b2= new Button("Clear"));
		b1.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void Windowclosing(WindowEvent e)
			{
				System.exit(0);
			}
				});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Applet1();
	}
	@Override
	public  void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(b1))
			t.setText("Hello World");
		if(o.equals(b2))
			t.setText("");
			
		
	}
	

}


