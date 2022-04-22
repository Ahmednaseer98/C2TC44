package DAY36;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application2 extends Frame implements ActionListener
{
	Button b1, b2;
	TextField t;
	
	public Application2()
	{
		setLayout(new FlowLayout());
		
		add(b1 = new Button(" Click "));
		add(t = new TextField(20));
		add(b2 = new Button(" Clear "));
		b1.addActionListener(this);		
		b2.addActionListener(new A());
		
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
		new Application2();
	}
	class A implements ActionListener	
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setText(" ");
		}
	}
}