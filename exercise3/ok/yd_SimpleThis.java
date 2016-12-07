class A {
    public static void main(String[] args){
        Foo a;
        int b;
    
        a = new Foo();
        b = a.foo(3);
    }
} 
  
class Foo {
    public int foo(int param1)
    {   
        return this.foo(param1 + 2);
    }
}
