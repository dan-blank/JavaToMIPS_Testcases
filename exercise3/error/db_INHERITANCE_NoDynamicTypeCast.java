class A {
	
	public static void  main(String[] args) {
		
		int result;
		Super anObject;
		anObject = new Sub();
		result = anObject.run();
		
	}
	
}

class Super {

}

class Sub extends Super {
	
	public int run(){
		return 1;
	}
	
}
