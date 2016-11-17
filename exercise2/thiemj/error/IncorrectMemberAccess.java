
class A {
    public static void main(String[] args){

    }
}
class B {
    public boolean mymember2() {
        B myselfnew;
        myselfnew = new B();
        System.out.println(myselfnew.mymember); // incorrect. we may only do calls!
        return 0;
    }
}
