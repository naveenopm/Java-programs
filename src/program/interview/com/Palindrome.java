package program.interview.com;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,r=0,t=0;
		t=n;
		while(n>0) {
			r=r*10+n%10;
			n=n/10;
		}
		
		if(t==r)
		System.out.println("is palindrome");
		else
		System.out.println("not palindrome");

	}

}
