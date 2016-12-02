class A {
	
	public static void main(String[] args) {
		
		int result;
		Super anObject;
		anObject = new Sub();
		result = anObject.run();
		
	}
	
}

class Super {

	public int run(){
		return 1;
	}

}

class Sub extends Super {
	
	
}
