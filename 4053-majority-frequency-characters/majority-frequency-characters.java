class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Integer,String> gmap=new HashMap<>();
        for(char keys:map.keySet()){
            int val=map.get(keys);
            gmap.put(val,gmap.getOrDefault(val,"")+keys);
        }
        String ans="";
        int maxsize=0;
        int maxvalue=0;
        for(int keys:gmap.keySet()){
            String str=gmap.get(keys);
            if(str.length()>maxsize || str.length()==maxsize && keys>maxvalue){
                maxsize=str.length();
                maxvalue=keys;
                ans=str;
            }
        }
        return ans;
        
    }
}