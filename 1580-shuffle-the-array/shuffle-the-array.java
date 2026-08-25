class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int i=0,j=n;
        int index=0;
        for(int k=0;k<n;k++){
            ans[index++]=nums[i];
            ans[index++]=nums[j];
            i++;
            j++;
        }
        return ans;
    }
}