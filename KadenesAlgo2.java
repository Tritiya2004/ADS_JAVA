package Arrays;

public class KadenesAlgo2 {
    public static void main(String[] args) {
        /*steps of kadenes algo:
        1. Initialization:  
        currsum=0 maxsum=Integer.Min_value

        2.Iterate through array=  compare currsum and maxsum
        
        [1,-2,3,4,-1,2,1,-5,4]
        start: currsum=0  , maxsum=Integer.min_value
        first ele(1):  currsum=max(1,0+1)1, maxsum=max(_IN,1)1
        second ele(-2):  currsum=max(-2,1-2)-1,  maxsum=max(1,-1)1
        third ele(3): currsum=max(3,-1+3)3, maxsum=(1,3)3
        fourth ele(4): currsum=max(4,3+4)7, maxsum(3,7)7
        fifth ele(-1): currsum=max(-1,7-1)6, maxsum(7,6)7
        sixth ele(2): currsum=max(2,2+6)8, maxsum=max(7,8)8
        seventh ele(1): currsum=max(1,1+8)9, maxsum=max(8,9)9


         */
        int[] nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));

    }

    public static int maxSubarray(int[] nums){
        if(nums==null|| nums.length==0){
            return 0;
        }
        int  currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int num:nums){
            currsum=Math.max(num,currsum+num);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }

    //this code is when u want to skip th negative sum value in currsum...

    public static int maxsubArraysum(int[] nums){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int num:nums){
            currsum=Math.max(num,currsum+num);
            if(currsum<0){
                currsum=0;
            }
            maxsum= Math.max(maxsum,currsum);
        }
        return maxsum;
    }


}
