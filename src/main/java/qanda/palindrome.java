package qanda;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();		
		if(ispallindrome(num)) {
			System.out.println("Igiven number is pallindrome");
		}else {
			System.out.print("given number is not pallindrome");
		}
		

	}
	
	public static boolean ispallindrome(int num) {
		int originalnum=num,rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev==originalnum;
	}

}
