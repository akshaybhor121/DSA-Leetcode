
class Solution {
    public long maxAlternatingSum(int[] nums) 
    {
        long[] sq =new long[nums.length];

        for(int i = 0;i<nums.length;i++)
        {
            sq[i] = (long)nums[i] * nums[i];

        }
        long score = 0;
        int n = nums.length;
        Arrays.sort(sq);
        
        for(int i= 0;i < n; i++)
        {
            if(i < n/2 )
            {
                score -= sq[i];
            }
            else
            {
                score += sq[i];
            }
        }
        return score;
    }
    
}