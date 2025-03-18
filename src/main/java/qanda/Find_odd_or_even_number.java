package qanda;

import java.util.Scanner;

public class Find_odd_or_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a scanner object
		Scanner s= new Scanner(System.in);
		//create a variable and assigning the user intput by scanner method
		System.out.println("Enter the value :");
		int a=s.nextInt();
		
		if(a%2==0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}
	}

}
