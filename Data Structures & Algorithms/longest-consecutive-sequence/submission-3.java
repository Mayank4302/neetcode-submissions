class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            int count=0;
            if(!set.contains(num-1)){
                int n=num;
                while(set.contains(n)){
                    count++;
                    n++;
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }
}