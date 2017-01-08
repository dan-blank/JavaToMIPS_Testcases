class NixDrin{
	public static void main(String[] args){
		Bar b;
		Foo f;
		int a;

		f = new Foo();
		b = new Bar();

		System.out.println(f.getBar().doSmth(b.set()));
	}
}

class Bar{
	int a;
	public int doSmth(int b)
	{
		a = 13;
		return a;
	}

	public int set()
	{
		a = 14;
		return a;
	}
}

class Foo{
	public Bar getBar()
	{
		return new Bar();
	}
}
