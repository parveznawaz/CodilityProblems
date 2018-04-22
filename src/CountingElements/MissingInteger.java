package CountingElements;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MissingInteger {
    public int solution(int[] A)
    {

        int minVal=Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        for(int x:A){
            if(x>0){
                minVal=Math.min(minVal,x);
                maxVal=Math.max(maxVal,x);
            }
        }

        if(minVal==Integer.MAX_VALUE) return 1;
        boolean seen[]=new boolean[maxVal];
       for(int x:A){
            if(x>0){
                seen[x-1]=true;
            }
        }

        int result=maxVal+1;
        for(int i=0;i<seen.length;i++){
            if(!seen[i]){
                return i+1;
            }
        }
        return result;
    }

    @Test
    public void test1(){
        Assert.assertEquals(5,solution(new int[]{1, 3, 6, 4, 1, 2}));
        Assert.assertEquals(4,solution(new int[]{1, 3, 2}));
        Assert.assertEquals(1,solution(new int[]{2}));
        Assert.assertEquals(1,solution(new int[]{-1, -3}));
        Assert.assertEquals(1,solution(new int[]{-1000000}));
        Assert.assertEquals(1,solution(new int[]{1000000}));
        Assert.assertEquals(6,solution(new int[]{5,3,1,2,4,11,12,13}));

    }
}
