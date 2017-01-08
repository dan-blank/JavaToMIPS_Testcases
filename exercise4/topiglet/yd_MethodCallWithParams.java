class NixDrin{
	public static void main(String[] args){
		Bar b;
		int a;

		b = new Bar();
		a = b.print(13, 4, true, 15);

		System.out.println(a);
	}
}

class Bar{
	public int print(int a1, int a2, boolean b1, int a3)
	{
		int a;
		a = 2;
		if (b1)
		{
			System.out.println(a3);
		}
		else
		{
			a = 1000;
		}

		System.out.println(a2);
		return 2*a*a1*a2;
	}
}
