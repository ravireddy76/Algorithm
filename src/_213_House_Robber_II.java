/**
 * 
 * Note: This is an extension of House Robber.
 * 
 * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.
 * 
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * @author Shengyi
 *
 */
//Note: process special cases first.
public class _213_House_Robber_II {
	public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        
        //Note: Add those in front.
        if (nums.length == 1) {
            return nums[0];
        }
        
        //Note: Add those in front.
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1));
    }
	
	private int helper(int[] nums, int start, int end) {
		int[] dp = new int[end - start + 1];
		
		dp[0] = nums[start];
		dp[1] = Math.max(nums[start], nums[start + 1]);
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
		}
		
		return dp[dp.length - 1];
	}
}
