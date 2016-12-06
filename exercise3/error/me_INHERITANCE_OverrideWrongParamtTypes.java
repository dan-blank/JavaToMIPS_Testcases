class A {
	public static void main(String[] args) {
	}
}

class Super {
    public int f(int a, boolean b) {
        return a;
    }
}

class Sub extends Super {
    public int f(boolean a, int b) {
        return b;
    }
}