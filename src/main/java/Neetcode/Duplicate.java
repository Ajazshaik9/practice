package Neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        System.out.println(containsDuplicate1(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>0;j--)
            {
                if(nums[j]==nums[i] && i!=j)
                    return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            if(!set.add(i))
                return true;
        }
        return false;
    }


    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length != set.size();
    }

}
