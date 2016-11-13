class Main {
    public static void main(String[] args){
        Foo foo;
        int result;
        int[] dummy;

        result = foo.start();

        System.out.println(result);

        result = foo.stop(1, 2, dummy);
	}
}

class Bar
{
    public int start()
    {
        return 1;
    }
}

class Foo extends Bar
{
    int tmp;
    public int start()
    {
        tmp = 1;
        return tmp;
    }

    public int stop(int a, int b, int[] c)
    {
        tmp = a + b + c;
        return tmp;
    }
}
