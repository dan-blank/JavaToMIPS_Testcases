class NixDrin{
	public static void main(String[] args){
		

		System.out.println(new B().foo()[0]);
		System.out.println(new B().foo()[10]);
	}
}

class B
{
	public int[] foo()
	{
		return new int[10];
	}

}
