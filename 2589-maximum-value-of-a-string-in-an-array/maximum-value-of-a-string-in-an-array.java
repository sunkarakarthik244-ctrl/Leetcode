class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            int length=0;
            int digitsum=0;
            for(char ch:s.toCharArray()){
                if(Character.isLetter(ch)){
                    length=s.length();
                    break;
                }
                else{
                    int digit=ch-'0';
                    digitsum=digitsum*10+digit;
                    length=digitsum;
                }
            }
            max=Math.max(max,length);
        }
        return max;
        
    }
}