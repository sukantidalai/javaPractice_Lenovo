class HelloWorld {
    public void multiplication(int num,int count) {
        
        System.out.print("[");
        for(int i=1;i<=count;i++)
        {
            if(i==count)
            System.out.print(num*i);
            else
            System.out.print((num*i)+",");
        }
        System.out.print("]");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        System.out.print("Enter count:");
        int b = sc.nextInt();
        HelloWorld wd = new HelloWorld();
        wd.multiplication(a,b);
    }
}
