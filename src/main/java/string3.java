
public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compare the strings
//		
//		String s1=new String("welcome");
//		System.out.println(s1);
//		
//		String s2="welcome";
//		
//		System.out.println(s1==s2);  //false here it will compare the objects s1 is variable and s2 is object so it give false
//		System.out.println(s1.equals(s2)); //true here it will compare the values
//	
//		String s3=s2;
//		
//		System.out.println(s2==s3); // true here s2 and s3 are both objects so it gives true
//		System.out.println(s2.equals(s3)); // true 
		
		
		//immutable = we cannot change the value once we assign to a variable, string
		//mutable = we can change string buffer, and stringbuilder
		
		/*Assignments
		 * 1. check string is palindrome or not
		 * string s ='madam'
		 * s2='welcome'
		 * 2. remove the junk or speical characters in string
		 * 3. how to remove the white saces in a string
		 * 4. count occurance of characters in a string
		 * 5. count words in string
		 * */
		
		
		// check the the string is palidrome or not?
//		boolean b=pa
		System.out.println(pallidrome("madam"));
		//remove the junk or speical charachter in string?// *,%,^,&,(,)
		
	}
	
	public static String cleantext(String s) {
		String temp="";
		
		for(int i=0; i<=s.length()-1; i++) {
			if ("$#@!".indexOf(s.charAt(i)) != -1) {
			    temp=temp+s.charAt(i);
			}else {
				s.replace(s.charAt(i), "");
			}
		}
		
		
		return s;
		
	}
	
	
	public static boolean pallidrome(String s) {
		String temp="";
		String hn=s;
		for(int i =s.length()-1; i>=0;i--) {
			temp=temp+s.charAt(i);
			
		}
		System.out.println(temp);
		if (s.equals(temp)) {
			System.out.println("*************************");
			System.out.println("is pallidrome");
			return true;
		}else {
			System.out.println("*************************");
			System.out.println("not is pallidrome");			
			return false;
			
		}
		
		
		
		
		
	}
	

}
