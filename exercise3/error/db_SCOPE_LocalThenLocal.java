class A {
	
	public static void main(String[] args) {
		
	}
	
}

class Sub {
	
	
	public int run1(){
		int a;
		return 1;
	}
	
	public int run2(){
		int b;
		return a; // we should not see a
	}
	
}
