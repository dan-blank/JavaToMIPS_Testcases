class NixDrin{
	public static void main(String[] args){
		Bar b;
		int a;

		b = new Bar();
		a = b.set(11);

		System.out.println(b.get());
	}
}

class Foo
{
	int a;
	public int get()
	{
		return a;
	}
}

class Bar  extends Foo{
	public int set(int b)
	{
		a = b;
		return a;
	}
}
