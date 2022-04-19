package DAY25;;
class Aa{
	
}
class Ab{
	int i;
	String S;
	public Ab(int i,String s) {
		this.i=i;


	}
}


public class EqualsDemo {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Aa a=new Aa();//ref 1
		Aa a1=a;
		Aa a2=new Aa();//ref 2
		if(a==a1)//equal
			System.out.println(" Equal");
		else
			System.out.println("Not Equal");
		if(a==a2)//Not equal
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a1))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a2))//not equal
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		Ab b=new Ab(10,"NASEER");//ref 1
		Ab b1=b;
		Ab b2=new Ab(10,"NASEER");//ref 2
		if(b==b1)//equal
			System.out.println(" Equal");
		else
			System.out.println("Not Equal");
		if(b==b2)//Not equal
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(b.equals(b1))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(b.equals(b2))//not equal
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
