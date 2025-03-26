package arrayqanda;

import java.util.Arrays;

public class arangearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2, 1, 0, 1, 2, 0, 1, 2};

        int low = 0, mid = 0, high = a.length - 1;
        
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a, mid, high);
                high--;
            }
        }

        System.out.println(Arrays.toString(a));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}