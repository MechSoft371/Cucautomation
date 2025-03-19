package qanda;

import java.util.Scanner;

public class armstrongnumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		int a,b,c,d,arm=0;
		d=no;	
				
		while(no>0) {
			a=no%10;
			no=no/10;
			arm=arm+a*a*a;
		}
		
		if(arm==d) {
			System.out.println("is armstrong number");
		}else {
			System.out.println("is not armstrong number");
		}
		
	}

}
