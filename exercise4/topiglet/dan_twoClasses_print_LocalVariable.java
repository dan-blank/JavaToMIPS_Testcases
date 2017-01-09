class Mainclass{
	public static void main(String[] args){
		int dummy;
		A anA;
		anA = new A();
		dummy = anA.run();
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