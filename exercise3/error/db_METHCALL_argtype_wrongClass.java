class Main {
	public static void main(String[] a){
		boolean b;
		b = new A().run(new AnotherClass());
	}
}

class A {
	public boolean run(LowClass f) {
		return true;
	}
}

class MiddeClass {
	
}

class LowClass extends MiddeClass {
	
}

class AnotherClass {
	
}