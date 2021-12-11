package basic.java;

 class FinalKeyword2 {
	
	int i = 90;
	
	 void print(){  // --------------------------> if we make this method final 
		System.out.println("printing");
	}
	
	class Key extends FinalKeyword2{
		
		public void print() { // ----------------> it cannot be overriden here. COMPILE TIME ERROR
			System.out.println("changing");
		}
	}

	public static void main(String[] args) {
		
	}
	}


