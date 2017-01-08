class NixDrin{
	public static void main(String[] args){
      	int[] i;
		i = new int[10];
      
	  	System.out.println(i[0]);
      	System.out.println(i[1]);
      	System.out.println(i[2]);
      	System.out.println(i[6]);
      	System.out.println(i[9]);
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
