package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<(1<<n);i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                int i1 = (1 << j) & i;
                if(i1!=0) list.add(nums[j]);
            }
            res.add(list);
        }
        return res;
    }
}
