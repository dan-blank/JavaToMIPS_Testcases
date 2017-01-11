class NixDrin{
	public static void main(String[] args){
		int[] a;
		Foo f;
      	int i;
      
		a = new int[10];
		f = new Foo();
        i = f.get_next_idx();

      	while(i < a.length)
        {
			System.out.println(a[f.get_next_idx()]);
			i = i + 1;
        }
}
}

class Foo
{
	int a;
  
	public int get_next_idx()
	{
		a = a + 1;
		return a;
	}
}
