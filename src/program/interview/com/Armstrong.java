package program.interview.com;

public class Armstrong {

	public static void main(String[] args) {
		int n=153,r=0,t=0,sum=0;
		t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
		if(t==sum)
		System.out.println("armstrong");
		else
			System.out.println("not armstorng");
	}

}
