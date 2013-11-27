/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 23/11/13
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class PythagoreanTriplet {
    /**
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

     a2 + b2 = c2
     For example, 32 + 42 = 9 + 16 = 25 = 52.

     There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     Find the product abc.
     */
    public static void main(String[] args)
    {
        for(int i=1;i<=1000;i++)
        {
            for(int j=1;j<=1000;j++)
            {
                int kk = (i*i)+(j*j);
                int k = (int)Math.sqrt(kk);
                if(Math.pow((double)(k),2.0)==kk)
                    if(i+j+k==1000)
                        System.out.println(i+" "+j+" "+k+" "+(i*j*k));
            }
        }
    }
}
