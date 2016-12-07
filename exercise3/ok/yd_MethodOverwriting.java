class A {
	public static void main(String[] args){
		Foo a;
		B b;	
		int v;
		a = new Bar();

		v = a.foo(2 + v);
		b = a.foo(b);
	}
}

class B
{}

class C extends B
{}

class Foo {
    public int foo(int param1, int param2)
    {
        int local1;
        local1 = 1;
        return local1;
    }

    public int foo(int param1)
    {
        return 2;
    }

	public B foo(B f)
	{
		return new B();
	}
}

class Bar extends Foo {
    public int foo(int param1, int param2)
    {
        int local1;
        local1 = 1;
        return local1;
    }

	public B foo(C f)
	{
		return new C();
	}	
}
