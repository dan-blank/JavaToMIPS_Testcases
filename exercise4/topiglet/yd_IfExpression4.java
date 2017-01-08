class NixDrin{
	public static void main(String[] args){
		boolean a;
		Foo f;

		f = new Foo();

		a = f.set(true, true);
		System.out.println(f.doSmth());

		a = f.set(true, false);
		System.out.println(f.doSmth());

		a = f.set(false, true);
		System.out.println(f.doSmth());

		a = f.set(false, false);
		System.out.println(f.doSmth());

		a = f.set(!true, !true);
		System.out.println(f.doSmth());

		a = f.set(!true, !false);
		System.out.println(f.doSmth());

		a = f.set(!false, true);
		System.out.println(f.doSmth());

		a = f.set(false, !false);
		System.out.println(f.doSmth());
	}
}

class Foo
{
	boolean a;
	public int doSmth()
	{
		int ret;
		ret = 0;
		
		if (a)
		{
			ret = 1;
		}
		else
		{
			ret = 0;
		}
		return ret;
	}

	public boolean set(boolean r, boolean l)
	{
		a = r && l;
		return a;
	}
}
