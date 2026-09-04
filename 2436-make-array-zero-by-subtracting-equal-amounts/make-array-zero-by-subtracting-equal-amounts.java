class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            if(ele!=0) set.add(ele);
        }
        return set.size();
        // int count=0;
        // while(true){
        //     int min=101;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]!=0){
        //             min=Math.min(min,nums[i]);
        //         }
        //     }
        //     if(min==101) break;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]!=0){
        //             nums[i]=nums[i]-min;
        //         }
        //     }
        //     count++;
        // }
        // return count;
        
        
    }
}