class NixDrin{
	public static void main(String[] args){
		Bar b1;
		Bar b2;
		int a;

		b1 = new Bar();
		b2 = new Foo();

		System.out.println(b1.func(10));
		System.out.println(b2.func(10));
	}
}

class Bar{
	public int func1(int a)
	{
		return 10;
	}
	public int func(int a)
	{
		return 0;
	}
}

class Foo extends Bar
{
	public int func2(int a)
	{
		return 5;
	}
	public int func3(int a)
	{
		return 4;
	}
	public int func(int a)
	{
		return a + 15;
	}

}
