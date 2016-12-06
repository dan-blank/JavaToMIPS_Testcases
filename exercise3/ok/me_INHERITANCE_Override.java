class A {
	public static void main(String[] args) {
	}
}

class Super {
    public int f(int a, boolean b) {
        return a;
    }

    public int g() {
        return 0;
    }
}

class Sub extends Super {
    public int f(int a, boolean b) {
        return 2*a;
    }

    public int g() {
        return 1;
    }
}