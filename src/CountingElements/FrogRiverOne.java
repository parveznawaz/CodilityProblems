package CountingElements;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        int count=X;
        boolean seen[]=new boolean[X];
        for(int i=0;i<A.length;i++){
            if(seen[A[i]-1]==false){
                count--;
                seen[A[i]-1]=true;
                if(count==0){
                    return i;
                }
            }
        }
        return  -1;
    }

    @Test
    public void test1(){
        Assert.assertEquals(1, solution(5,new int[]{1,2,3,4,5,6,7}));
    }
}
