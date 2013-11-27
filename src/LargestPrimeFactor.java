import java.util.Random;

/**
 * Created with intelliJ IDEA.
 * User: sonalraj
 * Date: 21/11/13
 * Time: 12:07
 * To change this template use File | Settings | File Templates.
 */
public class LargestPrimeFactor {
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
       What is the largest prime factor of the number 600851475143 ?
     */
    public static boolean isPrime(long n)
    {
        if(n<2)
            return false;
        if(n==2)
            return true;
        if(n%2==0)
            return false;
        for(long i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }


    public static long lowPrime(long n)
    {
        long large = 0;
         for(long i=2;i<=(n/2);i++)
             if(n%i==0)
                 if(isPrime(i))
                 {
                     if(i>large)
                         large=i;
                 }
         return large;
    }
    public static void main(String[] args)
    {
        System.out.println(lowPrime(600851475143L));
    }
}
