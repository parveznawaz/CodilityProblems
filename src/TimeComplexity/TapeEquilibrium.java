package TimeComplexity;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] result =new int[A.length];
        result[0]=A[0];

        for(int i=1;i<A.length;i++){
            result[i]=result[i-1]+A[i];
        }

        int minVal=Integer.MAX_VALUE;
        for(int i=0;i<result.length-1;i++){
            minVal=Math.min(minVal,Math.abs(2*result[i]-result[result.length-1]));
        }
        return minVal;
    }


    @Test
    public void test1()
    {

        Assert.assertEquals(2000,solution(new int[]{-1000, 1000}));
    }

}
