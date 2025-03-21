package qanda;

import java.util.Arrays;

public class arraryarrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] a = {2, 1, 0, 1, 2, 0, 1, 2}; // Input array

		        int count0 = 0, count1 = 0, count2 = 0;

		        // Step 1: Count occurrences of 0s, 1s, and 2s
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] == 0) {
		                count0++;
		            } else if (a[i] == 1) {
		                count1++;
		            } else {
		                count2++;
		            }
		        }

		        // Step 2: Overwrite the array with sorted values
		        for (int i = 0; i < count0; i++) {
		            a[i] = 0; // Fill 0s
		        }
		        for (int i = count0; i < count0 + count1; i++) {
		            a[i] = 1; // Fill 1s
		        }
		        for (int i = count0 + count1; i < a.length; i++) {
		            a[i] = 2; // Fill 2s
		        }

		        // Print sorted array
		        System.out.println(Arrays.toString(a));
		 

	}

}
