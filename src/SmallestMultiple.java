/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 23/11/13
 * Time: 10:42
 * To change this template use File | Settings | File Templates.
 */
public class SmallestMultiple {
    /**
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

     What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
     public static int[] getPrimeSieve(int n, int[] res)
     {
        for(int i=1;i<n;i++)
        {
            System.out.print("\nCancel multiples of : "+(i+1)+" : ");
            if(res[i]!=0)
            {
                for(int j=i+1;j<n;j++)
                    if(res[j]%(i+1)==0)
                    {
                        System.out.print(res[j]+" ");
                        res[j]=0;
                    }
            }
        }
         for(int i=0;i<n;i++)
             System.out.print(res[i]+" ");
         return res;
     }
     public static void main(String[] args)
     {
         //get all prime numbers between 1 and n
         //for each prime get the highest power. s.t. prime^p<n
         //now multiply them

         //create sieve;
         int n = 10;
         int[] res = new int[n];
         //fill sieve with numbers
         for(int i = 0;i<n;i++)
            res[i]=i+1;
         //get the primes from sieve
         System.arraycopy(getPrimeSieve(n,res),0,res,0,n);

         System.out.println();
         for(int i=0;i<n;i++)
             System.out.print(res[i]+" ");
         //get the multiples;
         int product = 1;
         for(int i=1;i<n;i++)
             if(res[i]!=0)
             {
                 //find power of the prime less than n;
                 int pow = 1;
                 while(Math.pow(res[i],pow)<=n)
                     pow++;
                 pow--;
                 System.out.println(res[i]+" "+pow);
                 product*=(Math.pow(res[i],pow));
                 System.out.println(product);
             }
         System.out.println(product);
     }

}
