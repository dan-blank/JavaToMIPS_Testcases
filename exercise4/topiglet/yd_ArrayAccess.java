class NixDrin{
	public static void main(String[] args){
		boolean a;
		Foo f;
      	int i;
		i = 0;
      
		f = new Foo();
      	a = f.set(new int[10]);
      

      	while(i < f.get().length)
        {
			System.out.println(f.get()[i]);
          	i = i + 1;
        }
}
}

class Foo
{
	int[] a;
  
  	public boolean set(int[] other)
    {
      	int i;
      	i = 0;
        a = other;

      	while(i < a.length)
        {
          	if (0 < i)
            {
        		a[i] = i + a[i - 1];
            }
          	else{}
            i = i + 1;
        }
    	return true;
    }
	
	public int[] get()
	{
		return a;
	}
}
