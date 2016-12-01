class A {
	
	public void static main(String[] args) {
		
		boolean result;
		Super anObject = new Sub();
		result = anObject.b;
		
	}
	
}

class Super {

	boolean b;

}

class Sub extends Super {
	
	int b;
	
}
