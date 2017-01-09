class Mainclass{
	public static void main(String[] args){
		int b;
		A anA;
		anA = new A();
		b = anA.run();
	}
}
class A {
	
	public int run(){
		int a;
		a = 1025;
		System.out.println(a);
		return 2;
	}
}