package practice;

import java.util.LinkedHashSet;

public class String1 {
    public static void main(String[] args) {
        String s = "pinaki";

           LinkedHashSet<Character> set = new LinkedHashSet<Character>();
           for(int i=0;i<s.length();i++)
           {
               set.add(s.charAt(i));
           }
        System.out.println(set);
    }
}
