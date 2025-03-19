package qanda;

import java.util.Scanner;

public class Findnumberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,a=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		if(n<0) {
			n=n*-1;
		}else if(n==0){
			n=1;
		}
		
		while(n>0) {
			n=n/10;
			a++;
			
		}
		System.out.println("count of the number: "+a);

	}

}
