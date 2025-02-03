import java.util.*;
public class problem16 {
    public static void main(String[] args) {
        int nums1[]={-1,2,1,-4};
        int target=1;
        System.out.println(SumofThree(nums1,target));
        }

    public static int SumofThree(int[]nums ,int target){
        Arrays.sort(nums);
        int closestSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int currsum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currsum)<Math.abs(target-closestSum)){
                    closestSum=currsum;
                }
                if(currsum<target){
                    left++;
                }
                else if(currsum<target){
                    left++;
                }
                else if(currsum>target){
                    right--;
                }
                else{
                    return currsum;
                }
            }
        }
        return closestSum;

    }
}
