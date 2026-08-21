class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> ls=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]==nums2[j]){
                if(!ls.contains(nums1[i])){
                    ls.add(nums1[i]);
                }
                i++;
                j++;
                
            }
        }
        int[] ans=new int[ls.size()];
        for(int k=0;k<ls.size();k++){
            ans[k]=ls.get(k);
        }
        return ans;
        
    }
}