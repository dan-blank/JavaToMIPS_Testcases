class A {
	
	public void static main(String[] args) {
		
		int result;
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
