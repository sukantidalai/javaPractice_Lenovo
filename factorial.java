import java.util.*;

class factorial{
    public int fact(int num)
    {
        if(num>=1)
            return num*fact(num-1);
            else
            return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        factorial h = new factorial();
        System.out.println(h.fact(num));
    }
}