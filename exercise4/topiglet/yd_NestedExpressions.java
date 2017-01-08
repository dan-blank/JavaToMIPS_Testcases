class NixDrin{
	public static void main(String[] args){
		boolean a1;
		boolean a2;
        int b;
		a1 = true;
		a2 = true;

	    b = 20;

		while (a1)
		{
			while (a2)
			{
				if (b*b < 100)
				{
					a2 = false;
				}
				else
				{
					b = b - 1;
				}
			}
			a1 = false;
		}
		System.out.println(b);
	}
}
