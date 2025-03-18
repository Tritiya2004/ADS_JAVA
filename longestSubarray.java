import java.util.Scanner;

public class longestSubarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter target value");
        int k=sc.nextInt();
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int target) {
        int sum=0;
        int maxl=0;
       
        int n=nums.length;

        for( int r=0;r<n;r++){
            sum=0;
            for(int l=r;l<n;l++){
                sum=sum+nums[l];
                if(sum==target){
                    maxl=Math.max(maxl,l-r+1);
                    break;
                }
            }

        }
        return maxl;

    }
}
