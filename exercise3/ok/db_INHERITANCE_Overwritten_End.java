class A {
	
	public static void main(String[] args) {
		
		int result;
		Super anObject;
		anObject = new SubSubSubSub();
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

class SubSub extends Sub {
	
	
}

class SubSubSub extends SubSub {
	
	
}

class SubSubSubSub extends SubSubSub {
	
	public int run(){
		return 2;
	}
	
}