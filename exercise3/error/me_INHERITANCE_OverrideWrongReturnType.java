class A {
	public static void main(String[] args) {
	}
}

class Super {
    public int f() {
        return 0;
    }
}

class Sub extends Super {
    public boolean f() {
        return false;
    }
}