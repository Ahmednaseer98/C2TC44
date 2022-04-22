package DAY36;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application3 extends Frame implements ActionListener
{
	Button b1, b2;
	TextField t;
	
	public Application3()
	{
		setLayout(new FlowLayout());
		
		add(b1 = new Button(" Click "));
		add(t = new TextField(20));
		add(b2 = new Button(" Clear "));
		b1.addActionListener(this);
		B b=new B(this);
		b2.addActionListener(b);
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.setText("Hello world");
	}
	public static void main(String[] args) {
		new Application3();
	}
	class B implements ActionListener	
	{
		Application3 a3;
		B(Application3 a3)
		{
			this.a3=a3;
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
		a3.t.setText(" ");
		}
	}
}
