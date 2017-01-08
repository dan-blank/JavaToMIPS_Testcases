class NixDrin{
	public static void main(String[] args){
		int a;
		a = new Bar().doSmth();
	}
}

class Bar
{
	int b;
	public int doSmth()
	{
		Foo f;
		b = 10;
		f = new Foo();

		System.out.println(f.set(10));
		

		while (f.exists(b))
		{	
			System.out.println(f.delete());
			b = b - 1;
		}

		return 1;
	}
}

class Foo
{
	int a;
	public int set(int b)
	{
		a = b;
		return a;
	}

	public boolean exists(int a)
	{
		return !(a < 1);
	}

	public int delete()
	{
		a = a - 1;
		return a;
	}

}
