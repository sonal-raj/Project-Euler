/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 23/11/13
 * Time: 16:38
 * To change this template use File | Settings | File Templates.
 */
public class SummationOfPrimes {
    /**
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * Find the sum of all the primes below two million.
     */
    private static int MAX=2000000;
    private static int[] sieve = new int[MAX];
    public static void SieveOfEratosthenes()
    {
        //populate the sieve
        for(int i=2;i<MAX;i++)
            sieve[i]=i;
        //sieve the data
        for(int i=2;i<MAX;i++)
            if(sieve[i]!=0)
            {
                for(int j=i+1;j<(MAX);j++)
                    if(sieve[j]%i==0)
                        sieve[j]=0;
            }
    }
    public static void main(String[] args)
    {
        Long sum = 0L;
        SieveOfEratosthenes();
        for(int i = 2;i<MAX;i++)
            if(sieve[i]!=0)
                sum+=(long)sieve[i];
        System.out.print(sum);
    }
}
