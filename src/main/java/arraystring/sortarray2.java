package arraystring;

public class sortarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,9,3,7,1,8,2,2,4};
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("sorted array");
		for(int num: arr) {
			System.out.println(num +" ");
		}

	}

}
