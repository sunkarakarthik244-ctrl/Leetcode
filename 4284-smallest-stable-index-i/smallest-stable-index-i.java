class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            int maxi=i;
            while(maxi>=0){
                max=Math.max(max,nums[maxi]);
                maxi--;
            }
            int min=Integer.MAX_VALUE;
            int mini=i;
            while(mini<nums.length){
                min=Math.min(min,nums[mini]);
                mini++;
            }
            int diff=max-min;
            if(diff<=k) return i;
        }
        return -1;
        
        
    }
}