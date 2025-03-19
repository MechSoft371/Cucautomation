package stringqanda;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
		
		char c;
		String nrev="";
		for(int i=0; i<=s.length()-1;i++) {
			c=s.charAt(i);
			nrev=c+nrev;
		}
		System.out.println("this is using for loop :"+nrev);

	}

}
