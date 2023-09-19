package practice;

public class AddNumbersInString {
    public static void main(String[] args)
    {
        String s = "15a10b30";
        int sum=0;
        int tsum=0;
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                num=s.charAt(i)-48;
                sum=sum*10+num;
            }
            else {
                tsum=tsum+sum;
                sum=0;
            }
        }
        tsum=tsum+sum;
        System.out.println(tsum);
    }
}
