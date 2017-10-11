package program.interview.com;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of prime");
	int num=sc.nextInt();
	boolean flag=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=false;
			break;
		}
	}
	if(flag)
		System.out.println("is prime");
	else
		System.out.println("not prime");
	}
}