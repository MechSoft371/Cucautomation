package arrayqanda;

import java.util.ArrayList;

public class firstandlastelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add("cherry");
		arraylist.add("Date");
		arraylist.add("Eleberry");
		
		if(!arraylist.isEmpty()) {
			String firstelement= arraylist.get(0);
			String lastelement = arraylist.get(arraylist.size()-1);
			
			System.out.println(firstelement);
			System.out.println(lastelement);
		}else {
			System.out.println("Array list is empty");
		}

	}

}
