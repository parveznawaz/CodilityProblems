package TimeComplexity;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A){
        if(A.length==0){
            return 1;
        }
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if((A[i]-1)!=i){
                return i+1;
            }
        }
        return A.length+1;
    }
}
