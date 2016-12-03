class Main {
	public static void main(String[] a){
		System.out.println(new A().run());
	}
}

class A {
	public int run() {
		int x;
		int y;
		return x;
	}
}

class B {
	public int run() {
		int x; // x could leak from the class A
		return x;
	}
}