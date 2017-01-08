class NixDrin{
	public static void main(String[] args){
		Bar b;
		int a;

		b = new Bar();

		System.out.println(b.doSmth(1));
	}
}

class Bar{
	int a;
	public int doSmth(int b)
	{
		a = 13;
		b = this.set();
		return a;
	}

	public int set()
	{
		a = 14;
		return a;
	}
}
