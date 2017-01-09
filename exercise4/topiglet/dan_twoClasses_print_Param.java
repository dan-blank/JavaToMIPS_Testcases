class Mainclass{
	public static void main(String[] args){
		int dummy;
		A anA;
		anA = new A();
		dummy = anA.run(432);
	}
}
class A {
	
	public int run(int intToPrint){
		System.out.println(intToPrint);
		return 2;
	}
}