/**
 * Desarollo del punto 2.2 (codingbat)
 */
public class Recursion2
{
    public boolean groupSum5(int start, int[] nums, int target) {

        if(start >= nums.length)
            return target == 0;

        if(start<nums.length-1)
        {
            if(nums[start]%5==0&&nums[start+1]!=1)
                return groupSum5(start+1, nums, target - nums[start]);
        }
        if(nums[start]%5==0)
            return groupSum5(start+2, nums, target - nums[start]);
        if(groupSum5(start+1, nums, target - nums[start]))
            return true ;

        if(groupSum5(start+1, nums, target))
            return true;
        return false;
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {

        if (start >= nums.length)

            return (target == 0);

        if (groupNoAdj(start+1, nums, target)) return true;
        if (groupNoAdj(start+2, nums, target-nums[start])) return true;
        return false;

    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        if(nums[start] == 6)
            return groupSum6(start+1, nums, target - 6);

        if(groupSum6(start+1, nums, target - nums[start]))
            return true;

        if(groupSum6(start+1, nums, target))
            return true;

        return false;
    }
}
