class Solution {
    public int minimumDeletions(int[] nums) {
        int maxele=Integer.MIN_VALUE;
        int minans=Integer.MAX_VALUE;
        int minele=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxele=Math.max(maxele,nums[i]);
            minele=Math.min(minele,nums[i]);
        }
        int df=deleteFront(nums,maxele,minele);
        int dl=deleteLast(nums,maxele,minele);
        int delete=deleteAnyWay(nums,maxele,minele);
        return Math.min(df,Math.min(dl,delete));


    }
    public int deleteFront(int[] nums,int maxele,int minele){
        int maxc=0;
        int minc=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxele){
                maxc++;
            }
            if(nums[i]==minele){
                minc++;
            }
            if(maxc<=1 || minc<=1){
                count++;
                if(maxc==1 && minc==1){
                    break;
                }
            }
        }
        return count;
    }
    public int deleteLast(int[] nums,int maxele,int minele){
        int maxc=0;
        int minc=0;
        int count =0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==maxele){
                maxc++;
            }
            if(nums[i]==minele){
                minc++;
            }
            if(maxc<=1 || minc<=1){
                count++;
                if(maxc==1 && minc==1){
                    break;
                }
            }
        }
        return count;
    }
    public int deleteAnyWay(int[] nums,int maxele,int minele){
        int mac=0;
        int mic=0;
        int dfc=0;
        int dlc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxele){
                mac++;
                if(mac==1){
                    dfc++;
                    break;
                }
            }
            if(nums[i]==minele){
                mic++;
                if(mic==1){
                    dfc++;
                    break;
                }
            }
            if(mac<1 || mic<1){
                dfc++;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            int maxc=0;
            int minc=0;
            if(nums[i]==maxele){
                maxc++;
                if(maxc==1){
                    dlc++;
                    break;
                }
            }
            if(nums[i]==minele){
                minc++;
                if(minc==1){
                    dlc++;
                    break;
                }
            }
            if(maxc<1 || minc<1){
                dlc++;
            }
        }
        return dfc+dlc;
    }
}