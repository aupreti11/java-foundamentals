package com.statickeyword;

public class StaticKeyword {
	
	// static variable is used for the memory management
	String name;   // ---> if we make these variables static we can called them on static method.
	int age;
	static String academy = "mattic";
	
	static {   // ----> this is the static block which is invoked before the main method.
		System.out.println("this is static block");  // --> first statement to be invoked is static block
	}  
	// static block comes with the instance initializer block
	
	{ System.out.println("this is from instance - initializer block");}
	// this is the second block to be invoked after static block before the main method.
	
	public void display() {
		System.out.println("this is from the parent class display method");
	}
	
	public StaticKeyword() { // ----> constructor can be called without creating an object.
		System.out.println("no args or default constructor is called.");
	}
	
	public StaticKeyword(String name, int age) {
		this.name=name;
		this.age = age;
	}
	
	static void myMethod() {  // ---> static method can be called without creating an object.
		//System.out.println(name, age); // --> non static variables cannot be called on static method.
	}
	
	void myPrint() {
		System.out.println("name =" +name+ " age = " +age+ " acedemy = " +academy+"");
	}
	

	public static void main(String[] args) {
		
		StaticKeyword obj = new StaticKeyword();
		obj.display();
		
		myMethod(); // ----> static method is called without the object.
		
		StaticKeyword obj2 = new StaticKeyword("amrit" , 30);
		obj2.myPrint();
		StaticKeyword obj3 = new StaticKeyword("muna" , 27);
		obj3.myPrint();
		StaticKeyword obj4 = new StaticKeyword("tiwari" , 21);
		obj4.myPrint();
		 // ----> static variables academy is called only once in myPrint() method no need to pass everytime in the constructor
	
	
	}

}
