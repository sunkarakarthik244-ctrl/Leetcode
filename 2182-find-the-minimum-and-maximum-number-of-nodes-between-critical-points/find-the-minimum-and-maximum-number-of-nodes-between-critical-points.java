/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> ls=new ArrayList<>();
        while(head!=null){
            ls.add(head.val);
            head=head.next;
        }
        if(ls.size()<=2) return new int[]{-1,-1};
        List<Integer> critical=new ArrayList<>();
        for(int i=1;i<ls.size()-1;i++){
            if(ls.get(i)>ls.get(i-1) && ls.get(i)>ls.get(i+1)){
                critical.add(i);
            }
            else if(ls.get(i)<ls.get(i-1) && ls.get(i)<ls.get(i+1)){
                critical.add(i);
            }
        }
        if(critical.size()<=1) return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        int max=0;
         for(int i=0;i<critical.size()-1;i++){
            min=Math.min(min,critical.get(i+1)-critical.get(i));
         }
         max=critical.get(critical.size()-1)-critical.get(0);
         return new int[]{min,max};

        
    }
}