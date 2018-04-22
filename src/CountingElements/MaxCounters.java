package CountingElements;

import org.junit.Assert;
import org.junit.Test;

public class MaxCounters {
    public int[] solution(int N, int[] A)
    {
        int [] arr=new int[N];

        int current_max=0;
        int latest_increase=0;

        int i=0;

        while(i<A.length)
        {
            if(A[i]==N+1){
                latest_increase=current_max;
            }else {
                arr[A[i] - 1] = Math.max(arr[A[i] - 1], latest_increase);
                arr[A[i] - 1]++;
                current_max = Math.max(current_max, arr[A[i] - 1]);
            }
            i++;
        }

        for(i=0;i<N;i++)
        {
            arr[i]=Math.max(arr[i],latest_increase);
        }
        return arr;
    }

    @Test
    public void test1(){
     Assert.assertEquals(new int[]{3, 2, 2, 4, 2},solution(500000000, new int []{3, 4, 4, 6, 1, 4, 4}));
    }
}
