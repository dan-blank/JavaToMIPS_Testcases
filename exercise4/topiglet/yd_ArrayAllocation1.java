class NixDrin{
	public static void main(String[] args){
		boolean a;
		Foo f;
      	int i;
		i = 0;
      
		f = new Foo();
      	a = f.set(new int[10]);
      
	  	System.out.println(f.get()[0]);
      	System.out.println(f.get()[1]);
      	System.out.println(f.get()[2]);
      	System.out.println(f.get()[6]);
      	System.out.println(f.get()[9]);
}
}

class Foo
{
	int[] a;
  
  	public boolean set(int[] other)
    {
        a = other;
    	return true;
    }
	
	public int[] get()
	{
		return a;
	}
}
