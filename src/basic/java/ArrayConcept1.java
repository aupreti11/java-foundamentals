package basic.java;

public class ArrayConcept1 {

	public static void main(String[] args) {
		
		int array[] = new int[3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		
		System.out.println("size of an array is: " + array.length);
		System.out.println("=================");
		System.out.println("Array Elements are");
		for(int i =0 ;i<array.length;i++) {
			System.out.println(array[i]);
		}
		int sum = 0;
		System.out.println("=================");
		System.out.println("After sum array elements are: ");
		for(int i=0;i<array.length;i++) {
			sum = sum + array[i];
			System.out.println(sum);
		}
		
	
		// multiplying the array elements by 3.
	
		System.out.println("=================");
		System.out.println("After multiplication array elements are: ");
		for(int i =0 ;i<array.length;i++) {
			array[i] = 3 * array[i];
			System.out.println(array[i]);
		}
	}

}
