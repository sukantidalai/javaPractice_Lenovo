class HelloWorld {
    public int factorial(int num)
    {
        if(num>=1)
            return num*factorial(num-1);
            else
            return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        HelloWorld h = new HelloWorld();
        System.out.println(h.factorial(num));
    }
}
