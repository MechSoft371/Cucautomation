package arrayqanda;

import java.util.Arrays;

public class secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arraylist ={4, 2, 3, 1,0, 6,12,15,20};
		int num=arraylist.length;
		Arrays.sort(arraylist);
		System.out.println("Second largest number :"+arraylist[num-2]);
		
		//smallest
		
		System.out.println(arraylist[0]);

	}

}
