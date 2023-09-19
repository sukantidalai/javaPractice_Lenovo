package practice;
import java.util.*;
public class unique {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 5,3,4,5,5,6,6,6,3,4,2};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }  if (a[i] == a[j] && i > j) {
                    break;
                }
            }
            if (count > 1) {
                System.out.println(a[i] +" present " + count + " times");
            }
            count=0;
        }
    }
}

