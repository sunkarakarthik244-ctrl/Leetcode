class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;

    }
}