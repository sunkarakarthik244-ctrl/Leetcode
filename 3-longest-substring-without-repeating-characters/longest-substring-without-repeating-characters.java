class Solution {
    public int lengthOfLongestSubstring(String s) {
        // hashmap aitey index ni update chesukuntam but hashset aitey repeat characeters ni remove chesukuntam 
        //fixedLength aitey last varaku vellali varible length aitey last-1 chalu


        //integer indicates ->index of the particular character
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,length=0,max=0;
        while(r<s.length()){ 
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                     l=map.get(s.charAt(r))+1;
                }
            }
            length=r-l+1;
            max=Math.max(max,length);
            map.put(s.charAt(r),r);
            r++;
        }
        return max;


        
    // Set<Character> set=new HashSet<>();
    // int max=0,l=0;
    // for(int r=0;r<s.length();r++){
    //     while(set.contains(s.charAt(r))){
    //         set.remove(s.charAt(l));
    //         l+=1;
    //     }
    //     set.add(s.charAt(r));
    //     max=Math.max(r-l+1,max);
    // }
    // return max;
    }
}