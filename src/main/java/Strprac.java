
public class Strprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// payment $100 paid
		
		//verify the $ is present in the given string?
		
		String str = "payment $100 paid";
		int j=0;
		for (int i=0; i<=str.length();i++) {
			System.out.println(str.charAt(i));
			if(str.charAt(i)=='$') {
				j +=1;
				System.out.println("finded");
				break;
			}
			
		}
		
		if(j>=1) {
			System.out.println("$ is present in the given string");
		}
		else {
			System.out.println("no symbole is present in the given string");
			System.out.print(j);
		}

	}

}
