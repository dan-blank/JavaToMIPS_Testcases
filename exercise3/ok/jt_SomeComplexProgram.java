
class A {
	public static void main(String[] args){
	    B aBObject;
	    aBObject = new B();
		System.out.println(aBObject.test(2, false));	
	}
}

class B {
    int a;
    int d;
    public int test(int a, boolean c) {
        int[] x;
        x = new int[5];
        return x[3];
    }
}


