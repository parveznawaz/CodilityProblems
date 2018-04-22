package Iterations;

public class BinaryGap {

    public int solution(int N)
    {
        int n=N;
        int result=0;
        int max=0;
        while(n%2==0) n=n/2;

        while(n>0){

            int v=n%2;
            if(v==0){
                max++;
            }else{
                if(max>result){
                    result=max;
                }
                max=0;
            }
            n=n/2;
        }
        return result;
    }


    public static void main(String [] args){
        BinaryGap obj=new BinaryGap();
        System.out.println(obj.solution(51712));
    }
}
