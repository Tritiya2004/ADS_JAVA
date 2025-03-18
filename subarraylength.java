package Arrays;

import java.util.HashMap;

public class subarraylength {
    public static void main(String[] args) {
        int[] arr={1,-2,3,4,-1,2,1,-5,4};
        int target=7;
        int maxLength = sublength( target,arr);
        System.out.println("Maximum length of subarray with sum " + target + " is: " + maxLength);
    }

    public static int maxSubArrayLength(int[]  nums,int target){
        HashMap<Integer,Integer>sumMap=new  HashMap<>();

        int currsum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            
        }
    }

    public static int sublength(int target,int[] nums){
        
        HashMap<Integer,Integer>sumMap = new HashMap<>();
        int currsum=0;
        int maxlength = 0;
        for(int i=0;i<nums.length;i++)
        { 
           currsum+=nums[i];
        
        if(currsum==target)
        {
            maxlength = i+1;
        }
        if(sumMap.containsKey(currsum-target))
        {
            maxlength = Math.max(maxlength,i-sumMap.get(currsum-target));
        }

        sumMap.putIfAbsent(currsum, i);

    }
    return maxlength;


    }
}
