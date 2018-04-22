package CountingElements;

import org.junit.Assert;
import org.junit.Test;

public class PermCheck {
    public int solution(int[] A)
    {
        boolean [] seen=new boolean[A.length];
        for (int x:A) {
            if(x-1<A.length){
                seen[x-1]=true;
            }
        }

        for(boolean x:seen){
            if(x!=true){
                return 0;
            }
        }
        return 1;

    }

    @Test
    public void test1(){
        Assert.assertEquals(1,solution(new int[]{1,2,3}));
        Assert.assertEquals(0,solution(new int[]{1,2,4}));
    }
}
