/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 23/11/13
 * Time: 18:37
 * To change this template use File | Settings | File Templates.
 */
public class DivisibleTriangularNumber {
    /**
     * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

     1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

     Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
     10: 1,2,5,10
     15: 1,3,5,15
     21: 1,3,7,21
     28: 1,2,4,7,14,28
     We can see that 28 is the first triangle number to have over five divisors.

     What is the value of the first triangle number to have over five hundred divisors?
     */

    public static int numFactors(int n)
    {
        int count=0;
        for(int i=1;i<(n/2);i++)
            if(n%i==0)
                count++;
        return count+1;
    }
    public static void main(String[] args)
    {
        int n = 1,res=0;
        int num = n*(n+1)/2;
        while(numFactors(num)<=5)
        {
            n++;
            res = num;
            num = n*(n+1)/2;
        }
        System.out.println(res);
    }
}
