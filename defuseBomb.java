public class defuseBomb {
    public static void main(String[] args) {
        int[] arr={4,9,11,16};
        
        
    }

    public static int[] decrypt(int[] code,int k){
        int n=code.length;
        int[] result= new int[n];
        if(k==0){
            return result;
        }
        int start,end,step;
        if(k>0){
            start=1;
            end=k;
            step=1;

        }
        else{
            start=-1;
            end=k;
            step=-1;
            k=-k;
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<=k;j++){
                int index=(i+(j*step)+n)%n; // handling circular array
                sum=sum+code[index];
            }
            result[i]=sum;
        }
        return result;
    }
}
