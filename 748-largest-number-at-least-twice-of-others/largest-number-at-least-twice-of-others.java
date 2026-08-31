class Solution {
    public int dominantIndex(int[] nums) {
        int first=0;
        int second=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                second=first;
                first=nums[i];
                index=i;
            }
            else if(nums[i]>second && nums[i]!=first){
                second=nums[i];
            }
            
        }
        if(second*2 <=first) return index;
        return -1;
        
        
    }
}