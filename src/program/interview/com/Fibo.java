package program.interview.com;

public class Fibo {
	static int n1=0,n2=1,n3;
	static void fiboseries(int count) {
		if(count>0) {
			n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(""+n3);
		fiboseries(count-1);}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=7;
		System.out.print(n1+""+n2);
		fiboseries(count-2);
		

	}

}
