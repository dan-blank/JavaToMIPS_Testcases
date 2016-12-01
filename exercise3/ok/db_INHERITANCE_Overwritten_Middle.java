class A {
	
	public void static main(String[] args) {
		
		int result;
		Super anObject = new SubSubSubSub();
		result = anObject.run();
		
	}
	
}

class Super {

	public int run(){
		return 1;
	}

}

class Sub extends Super {
	
	public int run(){
		return 2;
	}
	
}

class SubSub extends Sub {
	
	
}

class SubSubSub extends SubSub {
	
	
}

class SubSubSubSub extends SubSubSub {
	
	
}