class A {
	
	public static void main(String[] args) {
		Super anObject;
		Sub anotherObject;
		int b;
		anObject = new Super();
		anotherObject = anObject;
		{
			anObject = new Sub();
			anotherObject = anObject;
			b = anotherObject.run();
		}
		
	}
	
}


class Super {
	
}

class Sub extends Super {
	
	public int run(){
	
		return 1;
	
	}
	
}