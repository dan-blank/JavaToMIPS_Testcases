class Mainclass{
	public static void main(String[] args){
		int dummy;
		A anA;
		anA = new A();
		dummy = anA.setYTo7();
		dummy = anA.run();
	}
}
class A extends SuperA {

	public int setYTo7(){
		y = 7;
		return 0; // irrelevant return value
	}
	public int run(){
		System.out.println(y);
		return 0; // irrelevant return value
	}
}

class SuperA {
	int y;
}