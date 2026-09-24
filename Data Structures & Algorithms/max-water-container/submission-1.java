class Solution {
    public int maxArea(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int ans=0;
        while (i < j) {
            int min=Math.min(nums[i],nums[j]);
            ans=Math.max(ans,min*(j-i));
            if(nums[i]>nums[j]){
                j--;
            }else{
                i++;
            }

        }
        return ans;
    }
}
