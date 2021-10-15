public class DeleNodeList {
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode listNode=new ListNode(1,null);
        ListNode listNode2=solution.removeNthFromEnd(listNode,1);
        while(listNode2!=null){
            System.out.println(listNode2.val);
            listNode2=listNode2.next;
        }
    }
}


class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode=head;
        ListNode listNode1=head;
        ListNode listNode2=head;
        while(head!=null){
            try {
                for (int i = 0; i < n; i++) {
                    listNode1 = listNode1.next;
                }
            }catch (Exception e){
                if(head.next==null) {
                    if(listNode.next==null)
                        return null;
                    while(listNode2.next.next!=null)
                        listNode2=listNode2.next;
                    listNode2.next=null;
                    return listNode;
                }
                head.next=head.next.next;
                break;
            }
            if(listNode1!=null) {
                head = head.next;
            }
        }
        return listNode;
    }
}