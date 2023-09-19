package practice;

import java.util.Scanner;

public class PrintNumbers {
    public static void print(int num,int limit)
    {
        if(num<=limit)
        {
            System.out.println(num);
            print(num+1,limit);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int a = sc.nextInt();
        PrintNumbers pn = new PrintNumbers();
        pn.print(1,a);
    }
}
