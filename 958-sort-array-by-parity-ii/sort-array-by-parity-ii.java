class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans=new int[nums.length];
        List<Integer> els=new ArrayList<>();
        List<Integer> ols=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                els.add(nums[i]);
            }
            else{
                ols.add(nums[i]);
            }
        }
        int ei=0;
        int oi=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) ans[i]=els.get(ei++);
            else ans[i]=ols.get(oi++);
        }
        return ans;
    }
}