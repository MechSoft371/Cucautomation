
public class string2 {

	public static void main(String[] args) {
		//reverse a string
		
		/** How many ways we can reverse the string
		 * 
		 * **/
		String s= "Selenium";
		String rev="";
		
		for(int i =s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		//method2
		StringBuffer sb= new StringBuffer(s);
		System.out.println("using stringbuffer:"+sb.reverse());
		
		//method3 string to array
		char c[]=s.toCharArray();
		String temp = "";
		for (int j=c.length-1; j>=0; j--) {
			temp=temp+c[j];
		}
		System.out.println("using char:"+temp);
		
		
	}
}
