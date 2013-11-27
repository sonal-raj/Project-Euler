/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 23/11/13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class SumSquareDifference {
    /**
     * The sum of the squares of the first ten natural numbers is,

     12 + 22 + ... + 102 = 385
     The square of the sum of the first ten natural numbers is,

     (1 + 2 + ... + 10)2 = 552 = 3025
     Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

     Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */

    public static void main(String[] args)
    {
        int n = 100;
        int sumsq=0, sum=0;
        for(int i = 1;i<=n;i++)
        {
            sum+=i;
            sumsq+=(i*i);
        }
        System.out.println(Math.abs(sumsq-(sum*sum)));
    }
}
