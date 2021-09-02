
 //Definition for singly-linked list.
  public class ListNode {
     int val;
     ListNode next;


     ListNode() {

     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }




     public static void main(String[] args) {
         ListNode l1 = new ListNode(8,new ListNode(6,null));
         ListNode head1 = l1;
         ListNode l2 = new ListNode(6, new ListNode(4,new ListNode(8,null)));
         ListNode head2 = l2;
//         for(int i=0;i<6;i++){
//             l1.next=new ListNode(9, null);
//             l1=l1.next;
//         }
//         for(int i=0;i<3;i++){
//             l2.next=new ListNode(9,null);
//             l2=l2.next;
//         }
         Solution s=new Solution();
         ListNode a = s.addTwoNumbers(head1, head2);
         while (a != null) {
             System.out.println(a.val);
             a = a.next;
         }
     }
 }
 class Solution {
     public Solution() {
     }

     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int flat=0;
         ListNode listNode = new ListNode();
         ListNode head = new ListNode(0, listNode);
         while (l1 != null && l2 != null) {
             int a = 0;
             if (flat == 1) {
                 a += 1;
             }
             a += l1.val + l2.val;
             if (a >= 10) {
                 a = a % 10;
                 flat=1;
             }else{
                 flat=0;
             }
             listNode.val = a;
             l1 = l1.next;
             l2 = l2.next;
             listNode.next = new ListNode();
             listNode = listNode.next;
         }

         if (l1 == null && l2 != null) {
             while (l2 != null) {
                 int a = 0;
                 boolean jin = false;
                 if (flat==1) {
                     a = 1;}
                 a += l2.val;
                 if (a >= 10) {
                     a = a % 10;
                     flat=1;
                 }  else{
                     flat=0;
                 }
                 listNode.val = a;
                 listNode.next = new ListNode();
                 listNode = listNode.next;
                 l2 = l2.next;
             }
         }
         if (l2 == null && l1 != null) {
             while (l1 != null) {
                 int a = 0;
                 if (flat==1) {
                     a = 1;
                 }
                 a += l1.val;
                 if (a >= 10) {
                     a = a % 10;
                     flat=1;
                 }else {
                     flat=0;
                 }
                 listNode.val = a;
                 listNode.next = new ListNode();
                 listNode = listNode.next;
                 l1 = l1.next;
             }
         }
         if(flat==0&&listNode.val==0){
             listNode=head;
             while(listNode.next.next!=null)
                 listNode=listNode.next;
             listNode.next=null;
         }
         if (flat==1) {
             listNode.val = 1;
             listNode.next = null;
             listNode = listNode.next;
         }
         head = head.next;
         return head;
     }
 }

