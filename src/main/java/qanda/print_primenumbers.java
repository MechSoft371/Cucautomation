package qanda;

import java.util.Scanner;

public class print_primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print the prime number between 0 to");
		int lastnumber=sc.nextInt();
		
		for(int i=1; i<=lastnumber; i++) {
			boolean isprime=true;
			for( int j=2; j<=i/2;j++) {
				
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.println(i);}
		}
			
		}

	}

