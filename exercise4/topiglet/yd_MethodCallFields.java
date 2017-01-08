class NixDrin{
	public static void main(String[] args){
		Bar b;
		int a;

		b = new Bar();
		a = b.set(11);
		a = 0;

		System.out.println(b.get());
	}
}

class Bar{
	int a;
	public int set(int b)
	{
		a = b;
		return a;
	}

	public int get()
	{
		return a;
	}
}
