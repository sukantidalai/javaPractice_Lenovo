package practice;

public class StringEx {
    public static void main(String[] args)
    {
        String s1="call";
        String s2="Call";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        String s3= "Process finished with exit code";
        System.out.println(s3.substring(8,16));
    }
}
