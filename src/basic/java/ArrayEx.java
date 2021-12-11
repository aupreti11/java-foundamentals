package basic.java;

public class ArrayEx {
	
	static void findMin(int a[]) {
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]< min)
				min = a[i];
		}
		System.out.println("minimum number is: " + min);
	}
	
	static void findMax(int a1[]) {
		int max=a1[3];
		for(int i=0;i<a1.length;i++) {
			if(a1[i] > max)
				max = a1[i];
		}
		System.out.println("max number is: " + max);
	}
	
	public static void main(String[] args) {
		
		// single dimension array
		int array[] = new int[4];
		array[0] =11;
		array[1] =12;
		array[2] =13;
		array[3] =14;
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		for(int a: array) {
			System.out.println(a);
		}
		
		int array1[] = new int[] {1,2,3,4,5};
		for(int a1 :array1) {
			System.out.println(a1);
		}
		// Two - Dimensional array
		
		int arr[][] = new int[3][3];
		arr[0][0] =1;
		arr[0][1] =2;
		arr[0][2] =3;
		arr[1][0] =4;
		arr[1][1] =5;
		arr[1][2] =6;
		arr[2][0] =7;
		arr[2][1] =8;
		arr[2][2] =9;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("========");
		
		int a[][]= new int[][] {{4,5,6},{7,8,9},{0,1,2}};
		//int a1[][] = {{1,2,3},{1,2,3},{1,2,3}}; another way to declare the 2 dimensional array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("========");
		findMin(array); // ---> static method can be called without an instance or object.
		System.out.println("========");
		findMax(array1);
		System.out.println("========");
		
		// anonymous array this below is anonymous array because we only know which array we called at run time
		
		findMax(new int[] {5,6,7,9}); // we only give the value of array at run time.
		System.out.println("========");
		findMin(new int[] {0,1,2,3,4});
		
		// copy the char array to another char array
		
		char chararr[] = {'a','g','t','e','t','x','d'};
		char copyarr[] = new char[5];
		System.arraycopy(chararr, 0, copyarr , 0, 5);
		System.out.println("========");
		for(char c : copyarr) {
			System.out.println(c);
		}
		
		char chara[] = {'a','m','r','i','t'};
		char charcopy[] = new char[4];
		System.arraycopy(chara, 0, charcopy, 1, 3);
		System.out.println("========");
		for(char ch: charcopy) {
			System.out.println(ch);
		}
		
	}

}
