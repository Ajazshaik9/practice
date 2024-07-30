package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int []n = {1,2,2,3,3,4,1,1};
        System.out.println(numIdenticalPairs(n));
    }

    public static int numIdenticalPairs(int[] nums) {
        // int n = nums.length;
        // int c=0;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]==nums[j] && i<j) c++;
        //     }
        // }
        // return c;
        int count =0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int temp=map.get(nums[i]);
                count+=temp;
                map.put(nums[i],temp+1);
            }else{
                map.put(nums[i],1);
            }
        }
        return count;
    }
}
