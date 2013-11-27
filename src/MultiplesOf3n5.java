/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 21/11/13
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */
public class MultiplesOf3n5 {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     Find the sum of all the multiples of 3 or 5 below 1000.
     */
     public static int multiples(int n)
     {
         if(n<2)
             return n;
         int sum=0;
         for(int i=2;i<n;i++)
         {
            if(i%3==0 || i%5==0)
                sum+=i;
         }
         return sum;
     }

    public static void main(String args[])
    {
        System.out.println(multiples(1000));
    }

}
