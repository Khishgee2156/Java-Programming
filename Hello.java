class Hello {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(add(2, 3));
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static double subtract(double x, double y){
        return x > y ? x - y : y - x;
    }

    public static double multiply(double a, double b)
    {

        return a*b ;
    }

    public static double divide(double a, double b)
    {
        if(b==0)
        {
            System.out.println("Error");
            return 0;
        }

        return a/b;
    }
}