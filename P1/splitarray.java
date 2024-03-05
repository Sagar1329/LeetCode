import java.util.Arrays;
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int repeat=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
if(nums[i]==nums[i+1]&&nums[i+1]==nums[i+2])
{
    return false;
}
        }
   
        return true;
    }
}