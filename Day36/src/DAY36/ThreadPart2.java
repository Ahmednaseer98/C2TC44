package DAY36;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadPart2 extends Frame implements Runnable
{
	TextField t1, t2;
	Thread th1;
	int i, j;
	
	public ThreadPart2()
	{
		setLayout(new FlowLayout());
		
		add(t1 = new TextField(20));
		add(t2 = new TextField(20));
		
		th1 = new Thread(this);
		A a = new A();
		
		th1.start();
		a.start();
		
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
	public void run()
	{
		while(true)
		{
			t1.setText(String.valueOf(i));
			
			if(i==100)
				i =0;
			else
				i++;
			
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{	
			}
		}
	}
	public static void main(String[] args)
	{
		new ThreadPart2();
	}
	
	class A extends Thread
	{
		public void run()
		{
			while(true)
			{
				t2.setText(String.valueOf(j));
				if(j==100)
					j =0;
				else
					j++;
				
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{	
				}
			}
		}
	}
}