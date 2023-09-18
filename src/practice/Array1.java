package practice;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args)
    {
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        int[] b = new int[10];
        int c;
        int c1=0;
        int c2=0;
        while((c=in.nextInt())!=0)
        {
            if(c%2==0)
            {
                a[c1]=c;
                c1++;
            }
            else {
                b[c2]=c;
                c2++;
            }

        }
        for(int d:a)
        {
            if(d==0)
                break;
            System.out.println("even array :" + d);
        }
        for(int e:b)
        {
            if(e==0)
                break;
            System.out.println("odd array :" + e);
        }
    }
}
