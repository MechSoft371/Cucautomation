
public class Strprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse the given string
		// check the given string is palleldrom
		String s= "madam";
		String t="";
		for (int i=s.length()-1; i>=0;i--) {
			t = t + s.charAt(i);
			
		}
		 
		if(s.equals(t)) 
		{
			System.out.println("pallendrom");
	
		}else {
			System.out.print("not a pallendrom");
		}

	}

}
