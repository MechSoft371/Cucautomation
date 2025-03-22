package arrayqanda;

import java.util.HashSet;
import java.util.Set;

public class commonelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,3,4,5};
		int[] array2= {4,5,6,7,8};
		
		Set<Integer> commonElements = findcommonelement(array1,array2);
		
		System.out.println(commonElements);
		

	}

	private static Set<Integer> findcommonelement(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		Set<Integer> set1= new HashSet<>();
		Set<Integer> commonSet = new HashSet<>();
		
		for(int num : array1) {
			set1.add(num);
		}
		
		for(int num: array2) {
			if(set1.contains(commonSet)) {
				commonSet.add(num);
				
			}
		}
		
		return commonSet;
	}

}
