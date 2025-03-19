package qanda;

import java.util.Scanner;

public class armstrongnumber2 {
	
	public static boolean isarmstrong(int num) {
		int originalnumber=num;
		int sum=0;
		int a=String.valueOf(originalnumber).length();
		int b;
		
		while(num>0) {
			b=num%10;
			sum=(int) (sum + Math.pow(b,a));
			num=num/10;
		}
		
		return sum==originalnumber ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isarmstrong(num)) {
			System.out.println("Is armstrong number");
		}else {
			System.out.println("is not armstrong number");
		}
		
		
	}
	
	

}
