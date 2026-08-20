class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        ls1.add(nums[0]);
        ls2.add(nums[1]);
        int k=0;
        int l=0;
        for(int i=2;i<n;i++){
            if(ls1.get(k)>ls2.get(l)){
                ls1.add(nums[i]);
                k++;
            }
            else{
                ls2.add(nums[i]);
                l++;
            }
        }
        int s1=ls1.size();
        int s2=ls2.size();
        int totalsize=s1+s2;
        int[] res=new int[totalsize];
        for(int i=0;i<s1;i++){
            res[i]=ls1.get(i);
        }
        int j=0;
        for(int i=s1;i<totalsize;i++){
            res[i]=ls2.get(j);
            j++;
        }
        return res;   
    }
}