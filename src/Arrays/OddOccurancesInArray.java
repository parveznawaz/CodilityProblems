package Arrays;

public class OddOccurancesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result=0;
        for (int x:A){
            result=result ^ x;
        }
        return result;
    }
}
