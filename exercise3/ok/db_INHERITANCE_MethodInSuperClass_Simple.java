class A {
	
	public static void static main(String[] args) {
		
		int result;
		Super anObject = new Sub();
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
