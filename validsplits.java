package Arrays;

public class validsplits {
    public static void main(String[] args) {
        int[] arr={10,4,-8,7};
        
    }

    public static validSplit(int[] arr){
        int totalsum=0;
        for(int num:arr){
            totalsum=totalsum+num;
        }
        int leftsum=0;
        long validSplits=0;

        for(int i=0;i<arr.length-1;i++){
            leftsum=arr[i];
            int rightsum=totalsum-leftsum;
            if(leftsum>=rightsum){
                validSplits++;
            }
        }
        return validSplits;
    }
}
