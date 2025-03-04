
public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compare the strings
		
		String s1=new String("welcome");
		System.out.println(s1);
		
		String s2="welcome";
		
		System.out.println(s1==s2);  //false here it will compare the objects s1 is variable and s2 is object so it give false
		System.out.println(s1.equals(s2)); //true here it will compare the values
	
		String s3=s2;
		
		System.out.println(s2==s3); // true here s2 and s3 are both objects so it gives true
		System.out.println(s2.equals(s3)); // true 
	}
	

}
