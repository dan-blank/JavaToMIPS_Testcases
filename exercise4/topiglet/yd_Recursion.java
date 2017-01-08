class NixDrin{
	public static void main(String[] args){
		Bar b;
		Foo f;
		int a;

		b = new Bar();

		a = b.countdown(10, new Foo()) + 1;
		System.out.println(a);
	}
}

class Bar{
	public int countdown(int a, Foo f)
	{
		int b;
		b = a;
		System.out.println(a);
		System.out.println(a-1);
		if ((0 - a) < 0)
		{
			a = f.countdown(a - 1, new Bar());
		}
		else{}

		return b;
	}
}

class Foo
{
	public int countdown(int a, Bar b)
	{
		System.out.println(a);
		if ((0 - a) < 0)
		{
			a = b.countdown(a - 1, new Foo());
		}
		else{}

		return 1;
	}

}
