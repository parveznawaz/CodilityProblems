package Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K)
    {
        if(A.length==0) return A;
        int k=K%A.length;
        int[] result=new int[A.length];
        for(int i=0;i<A.length;i++){
            result[(i+k)%A.length]=A[i];
        }
        return result;
    }
}
