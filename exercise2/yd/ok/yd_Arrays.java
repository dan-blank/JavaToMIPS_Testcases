class Main {
    public static void main(String[] args){
        int i;
        int[] p2;

        p2 = new int[100];
        i = 0;
        while (i < 100)
        {
            p2[i] = i*i;
            i = i + 1;
        }

        i = 100;
        while(!(i < 0))
        {
            System.out.println(i);
            System.out.println(p2[i]);
            i = i - 10;
        }
    }
}
