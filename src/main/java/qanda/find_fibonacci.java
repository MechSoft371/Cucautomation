package qanda;

import java.util.Scanner;

public class find_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int ran=sc.nextInt();
		int first=0;
		int second=1;
		int next;
		for(int i=0; i<=ran; i++) {
			System.out.print(first+" ");
			next=first+second;
			first=second;
			second=next;
			
		}

	}

}
