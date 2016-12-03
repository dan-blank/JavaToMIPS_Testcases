class A {
	public static void main(String[] args) {
		Super aHigherClass;
		Sub aLowerClass; 
		aHigherClass = new Sub();
		aLowerClass = aHigherClass; // Sub to Super not possible w.o. type casts
	}
}

class Super {
}

class Sub extends Super {
}