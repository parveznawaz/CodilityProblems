package TimeComplexity;

public class FrogJump {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        boolean[] seen=new boolean[X+1];

        int count=X;
        for(int i=0;i<A.length;i++){
            if(seen[A[i]-1]==false){
                seen[A[i]-1]=true;
                count--;

                if(count==0){
                    return i;
                }
            }
        }
        return -1;
    }


}
