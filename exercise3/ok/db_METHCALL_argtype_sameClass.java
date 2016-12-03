class Main {
	public static void main(String[] a){
		boolean b;
		b = new A().run(new MiddeClass());
	}
}

class A {
	public boolean run(MiddeClass f) {
		return true;
	}
}

class MiddeClass{
	
}

class LowClass extends MiddeClass {
	
}

class AnotherClass {
	
}