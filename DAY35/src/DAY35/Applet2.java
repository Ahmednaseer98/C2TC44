
import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Applet2 extends Frame implements ActionListener {
	Button b1,b2;
	TextField t;
	public Applet2{
		add(b1= new Button("Click"));
		add(t = new TextField(15));
		add(b2= new Button("Clear"));
		b1.addActionListener(this);
		//A a =new A();
		b2.addActionListener(new A());
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
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		t.setText("Hello World");
	}
	public static void main(String[] args) {
		new Applet2();
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

