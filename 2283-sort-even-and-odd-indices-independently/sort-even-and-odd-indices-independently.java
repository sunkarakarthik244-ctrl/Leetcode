class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int s1=even.size();
        int s2=odd.size();
        int[] ans=new int[s1+s2];
        int ei=0;
        int oi=1;
        for(int i=0;i<s1;i++){
            ans[ei]=even.get(i);
            ei+=2;
        }
        for(int i=0;i<s2;i++){
            ans[oi]=odd.get(i);
            oi+=2;
        }
        return ans;
    }
}