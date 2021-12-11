package basic.java;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// array are used to store multiple values in a single variable instead of declaring separate variables for each value.
		
		
		// one way to declare array
		
		int a[] = new int[4];
		a[0] = 1;  	// index 0 element
		a[1] = 2;	// index 1 element
		a[2] = 3;	// index 2 element
		a[3] = 4;	// index 3 element  last index n= n-1;
		
		System.out.println("size of an array: " + a.length);  //. length method gives the size of an array.
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=================");
		
		// another way to declare array
		
		int [] array = new int[] {10,20,30,40};
		for(int j=0;j<array.length;j++) {
			System.out.println(array[j]);
		}
		
		System.out.println("=================");
		
		// another way 
		
		int[] arr = new int[] {100,200,300,400};
		System.out.println(arr[3]);
	}

}
