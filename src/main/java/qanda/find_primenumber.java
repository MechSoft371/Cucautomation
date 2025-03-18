package qanda;

import java.util.Scanner;

public class find_primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number :");
		
		int a= sc.nextInt();
		
		if(isprime(a)) {
			System.out.println("Given number is prime number");
		}else {
			System.out.println("Given number is not a prime number");
		}
		

	}
	
	public static boolean isprime(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
