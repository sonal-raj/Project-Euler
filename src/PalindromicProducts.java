/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 23/11/13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public class PalindromicProducts {

    public static boolean isPalindrome(Long n)
    {
        String s = n.toString();
        int ln = s.length();
        for (int i=0;i<(ln / 2) + 1;++i) {
            if (s.charAt(i) != s.charAt(ln - i - 1)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args)
    {
        long max = 0;
        for(long i=999;i>=100;i--)
            for(long j=999;j>=100;j--)
                if(isPalindrome(i*j))
                {
                    if(i*j>max)
                        max=i*j;
                }
        System.out.println(max);
    }
}
