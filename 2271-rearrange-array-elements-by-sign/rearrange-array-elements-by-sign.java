class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int ele:nums){
            if(ele>0){
                pos.add(ele);
            }
            else{
                neg.add(ele);
            }
        }
        int[] ans=new int[nums.length];
        int i=0;
        int j=1;
        for(int k=0;k<pos.size();k++){
            ans[i]=pos.get(k);
            i+=2;
            ans[j]=neg.get(k);
            j+=2;
        }
        return ans;

        
    }
}