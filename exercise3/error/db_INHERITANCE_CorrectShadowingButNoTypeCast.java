class A {
	
	public static void main(String[] args) {
		
		int result;
		Super anObject;
		anObject = new Sub();
		result = anObject.getB();
		
	}
	
}

class Super {

}

class Sub extends Super {
	
	public int getB(){
		return 1;
	}
	
}
