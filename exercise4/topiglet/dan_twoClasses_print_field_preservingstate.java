class Mainclass{
	public static void main(String[] args){
		int dummy;
		A anA;
		anA = new A();
		dummy = anA.setXTo7();
		dummy = anA.run();
	}
}
class A {
	int x;
	public int setXTo7(){
		x = 7;
		return 0; // irrelevant return value
	}
	public int run(){
		System.out.println(x);
		return 0; // irrelevant return value
	}
}