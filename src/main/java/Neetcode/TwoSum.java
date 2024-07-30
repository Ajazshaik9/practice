package Neetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums={2,3,4,5,6,7};
        int target = 9;
        System.out.println();twoSum(nums,target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            //curr+x=target
            //x=target-curr
            int x = target - curr;
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;
    }

    private static int[] targetSum(int[] nums, int target) {
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(nums[i]==target-nums[j])
                {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

}
