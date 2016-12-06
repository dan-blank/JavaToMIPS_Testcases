class M {public static void main(String[] args) {}}

//Direct cycle
class A extends B {}
class B extends A {}

//3-cycle
class A1 extends A2 {}
class A2 extends A3 {}
class A3 extends A1 {}