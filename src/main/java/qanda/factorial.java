package qanda;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int facto=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		
		for(int i=1;i<=a;i++) {
			facto=facto*i;
		}
		
		System.out.println(facto);
	}

}
