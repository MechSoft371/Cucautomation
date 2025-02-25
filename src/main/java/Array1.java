import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Array___
		 * Array is the collection of the element of same datatype (homogenious data)
		 * we can store the multiple values into a single variable*/
		
		int a[]=new int[7];//creating a array variable and assigning the size of the array
		int b[]= {1,2,3,4,5,6,7,7};
		//  index mean location,or address of the element
		// starting index is 0 and ending index is n-1
		a[0]=12;
		a[1]=13;
		a[2]=14;
		a[3]=15;
		a[4]=16;
		a[5]=17;
		a[6]=18;
		//a[7]=19; //Index 7 out of bounds for length 7
		
		//types of the arrays
		// Single dimensional
		// two dimensional 
		
		/***
		 * Single dimensional array common operations 
		 * 1. declare an array
		 * 2. add value of an array
		 * 3. Find the size of array
		 * 4. read single values from an array
		 * 5. read multiple values from the array
		 * **/
		
		//declaring an array
		int a1[]= new int[5]; //declaration
		//assigning the data
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		a1[4]=50;
		
		//appraoch2
		int a2[]= {10,20,30,40,50,60};// declaration and adding values to an array is done by single line
		
		System.out.println(a1.length +":"+" is the size of first appraoch1");
		
		System.out.println(a2.length +": is the size of the second appraoch2");
		
		System.out.println(a1[4]);
		
		
		for(int j=0; j<=a1.length-1; j++) {
			System.out.print(a1[j]+",");
			
		}
		
		System.out.println(Arrays.toString(a1));
		
		
		
		// Enhanced for loop >>>>>> for each loop
		for(int x:a1) {
			System.out.println(x);
		}
				
		
		

	}

}
