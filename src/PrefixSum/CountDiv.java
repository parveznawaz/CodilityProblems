package PrefixSum;

import org.junit.Assert;
import org.junit.Test;

public class CountDiv {
    public int solution(int A, int B, int K) {
        if(A == 0 && B==0) return 1;
        else if(A==0) return B/K+1;
        else return (B/K-(A-1)/K);
    }

    @Test
    public void test1(){
        Assert.assertEquals(2,solution(5,11,3));
        Assert.assertEquals(0,solution(1,1,11));
    }
}
