package DAY34;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo6 extends Frame {
	TextField t1,t2;
	public ThreadDemo6() {
		setLayout(new FlowLayout());
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(40,400);
		setVisible(true);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo6();
	}

}
