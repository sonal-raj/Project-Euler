import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 23/11/13
 * Time: 12:05
 * To change this template use File | Settings | File Templates.
 */

public class the10001stprime {
    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
       What is the 10 001st prime number?
     */
    public static void calcPrime(int inp) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);

        int counter = 4;

        while(arr.size() < inp) {
            if(counter % 2 != 0 && counter%3 != 0) {
                int temp = 4;
                while(temp*temp <= counter) {
                    if(counter % temp == 0)
                        break;
                    temp ++;
                }
                if(temp*temp > counter) {
                    arr.add(counter);
                }
            }
            counter++;
        }

        System.out.println(arr.get(inp-1));
    }

    public static void main(String[] args)
    {
            calcPrime(10001);
    }
}


