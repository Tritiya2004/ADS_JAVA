import java.util.*;

public class leetcode560
{
    public int subarraysum(int[] nums,int k){
        Map<Integer,Integer>psc=new HashMap<>();

        psc.put(0,1);
        int presum=0;
        int co=0;

        int (num:nums){
            presum=presum+num;
            if(psc.containsKey(presum-k)){
                co+=psc.get(presum-k);

            }
            psc.put(presum,psc.getOrDefault(presum,0)+1);
        }
        return co;

    }
    public static void main(String[] args){
        int[] nums={1,1,1};
        int k=2;
        System.out.println(subarraysum(nums,k));
        
    }
}