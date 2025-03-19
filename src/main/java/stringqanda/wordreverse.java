package stringqanda;

import java.util.Scanner;

public class wordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String st= sc.nextLine();
		String[] c=st.split(" ");
		String nrevstr="";
		//System.out.println(c);
		for(int i=0;i<c.length;i++) {
			String cc=c[i];
			char ch;
			String revword="";
			for(int j=0;j<cc.length();j++) {
				ch=cc.charAt(j);
				revword=ch+revword;
			}
			nrevstr=nrevstr+revword+" ";
		}
		System.out.println(nrevstr);

	}

}
