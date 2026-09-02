class Solution {
    public int findFinalValue(int[] nums, int original) {
        // List<Integer> ls=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     ls.add(nums[i]);
        //     while(ls.contains(original)){
        //         original*=2;
        //     }
        // }
        // return original;
        int i=0;
        while(i<nums.length){
            if(nums[i]==original){
                original=nums[i]*2;
                i=0;
            }
            else{
                i++;
            }
        }
        return original;

    }
}