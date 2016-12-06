class MyMainClass {
    public static void main(String[] args) {
        A myA;
        int[] p;
        B myB;
        myA = new A();
        p = new int[4*2];
        System.out.println(myA.m_a1(2, p, false));

        myB = new B();
        myA = myB;

        System.out.println(myB.m_a2()[3]); // Use method that B inherited from A

    }
}

class A {
    int f_a1;
    int[] f_a2;
    boolean f_a3;

    public int m_a1(int p1, int[] p2, boolean p3) {
        int retval;
        if(p3)
            retval = p1 + p2[8];
        else {
            retval = f_a1;
        }
        return retval;
    }

    public int[] m_a2() {
        return f_a2;
    }
}

class B extends A {
    int f_a1;
    boolean f_a4;

    public int m_a3() {
        return this.m_a2()[0] + f_a1; // Use method that B inherited from A and field that it inherited
    }
}