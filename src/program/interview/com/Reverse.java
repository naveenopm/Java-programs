package program.interview.com;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121,r=0,t=0;
		while(num!=0) {
			r=r*10;
			r=r+num%10;
			num=num/10;
	}
		System.out.println(r);
		
		

	}
}
