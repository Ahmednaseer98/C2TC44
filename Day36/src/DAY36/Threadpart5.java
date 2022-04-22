package DAY36;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Threadpart5  extends Frame implements Runnable
{
	TextField t1, t2,t3,t4,t5;
	Thread th1,th2,th3,th4,th5;
	int i, j,k,l,m;
	public Threadpart5() 
	{
		setLayout(new FlowLayout());
		add(t1 = new TextField(50));
		add(t2 = new TextField(50));
		add(t3=new TextField(50));
		add(t4=new TextField(50));
		add(t5=new TextField(50));
		th1= new Thread(this);
		th2 = new Thread(this);
		th3=new Thread(this);
		th4=new Thread(this);
		th5=new Thread(this);
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		addWindowListener(new WindowAdapter() {
			@Override 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
			});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Threadpart5();
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Thread th  = Thread.currentThread();
			if(th.equals(th1)) {
				t1.setText(String.valueOf(i));
				if(i==100)
					i= 0;
				else
					i++;
			}
			if(th.equals(th2)) {
				t2.setText(String.valueOf(j));
				if(j==100)
					j= 0;
				else
					j++;
				if(th.equals(th3)){
					t3.setText(String.valueOf(i));
					if(i==100)
						i= 0;
					else
						l++;
					if(th.equals(th4)){
						t4.setText(String.valueOf(i));
						if(i==100)
							i= 0;
						else
							l++;
						if(th.equals(th5)){
							t5.setText(String.valueOf(i));
							if(i==100)
								i= 0;
							else
								m++;
						
				
			}
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				
			}
		}
	}
	}
}
}
}

