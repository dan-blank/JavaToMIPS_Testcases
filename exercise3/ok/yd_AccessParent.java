class A {
	public static void main(String[] args){
        Foo a;
		Foo b;
		a = new Bar();
		b = new Foo();
	}
}

class Foo
{
	int a;
}

class Bar extends Foo
{
	public int func()
	{
		return a;
	}
}
