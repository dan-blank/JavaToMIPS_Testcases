
class Main {
    public static void main(String[] args){
        Foo f;
    }
}

class Foo {
    int a;
    boolean b;
    int[ ] c;
    int[] c;
    int [] v;
    int [ ] v1;
    Custom d;
    Foo v;

    public boolean bar()
    {
        int a;
        int b;
       
        { b = 1; a = b;} 

        return false;
    }
}
