class A {
	
	public void static main(String[] args) {
		
		int result;
		Super anObject = new Sub();
		AnotherSub implicitelyDowncastedObject = anObject;
		
	}
	
}

class Super {

}

class Sub extends Super {
	
	public int run(){
		return 1;
	}
	
}

class AnotherSub extends Super {
	
}