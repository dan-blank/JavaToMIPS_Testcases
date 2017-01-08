class NixDrin{
	public static void main(String[] args){
		Bar b;
		int a;

		b = new Bar();
		a = b.print();
		System.out.println(a);
	}
}

class Bar{
	public int print()
	{
		int a;
		a = 20;
		System.out.println(a);
		return 2;
	}
}
