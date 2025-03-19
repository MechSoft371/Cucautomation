package qanda;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		int rev=0,r,a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		no=sc.nextInt();
		while(no>0) {
			r=no%10;
			rev=rev*10+r;
			no=no/10;
		} 
		
		System.out.println("reverse no:" +rev);
		
	}

}
