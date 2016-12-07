class A {
    public static void main(String[] args){
        Foo a;
        int b;
    	boolean c;

        a = new Foo();
        b = a.foo(2, 3);
        c = a.foo1(3);
    }
} 
  
class Foo {
    public int foo(int param1, int param2)
    {   
        int local1;
        local1 = 1;
        return local1;
    }
    
    public int foo1(int param1)
    {   
        return 2;
    }
}
