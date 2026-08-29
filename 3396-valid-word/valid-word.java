class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        word=word.toLowerCase();
        int conscount=0;
        int vowelcount=0;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowelcount++;
                }
                else{
                    conscount++;
                }
            }
        }
        if(conscount<1 || vowelcount<1) return false;
        return true;
        
    }
}