package PrefixSum;

import org.junit.Assert;
import org.junit.Test;

public class PassingCars {
    public int solution(int[] A)
    {
        int west=0,carPassing=0;
        for(int i=A.length-1;i>=0;i--){
            if(A[i]==0){
                carPassing+=west;
                if(carPassing>1000000000) return -1;
            }else{
                west+=1;
            }
        }
        return carPassing;
    }

    @Test
    public void test1(){
        Assert.assertEquals(5,solution(new int[]{0,1,0,1,1}));
    }
}
