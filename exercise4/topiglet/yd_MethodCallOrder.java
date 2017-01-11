class A{
    public static void main(String[] args){
        B b;
        b = new B();
        System.out.println(b.ret().run());
    }   
}

class B{
    public B ret()
    {   
      	System.out.println(1);
        return new B();
    }
  
  	public int run()
    {
      	System.out.println(2);
   		return 3;
    }
  	
}
