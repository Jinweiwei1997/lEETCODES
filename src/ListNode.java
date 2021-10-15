
 //Definition for singly-linked list.
 class ListNode1 {
     int val;
     ListNode next;


     ListNode1() {

     }

     ListNode1(int val) {
         this.val = val;
     }

     ListNode1(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }




     public static void main(String[] args) {
         ListNode l1 = new ListNode(9, new ListNode(9,new ListNode(1,null)));
         ListNode head1 = l1;
         ListNode l2 = new ListNode(1,null);
         ListNode head2 = l2;
//         for(int i=0;i<6;i++){
//             l1.next=new ListNode(9, null);
//             l1=l1.next;
//         }
//         for(int i=0;i<3;i++){
//             l2.next=new ListNode(9,null);
//             l2=l2.next;
//         }
         Solution2 s=new Solution2();
         ListNode a = s.addTwoNumbers(head1, head2);
         while (a != null) {
             System.out.println(a.val);
             a = a.next;
         }
     }
 }
 class Solution2 {
     public Solution2() {
     }

     public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
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
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int flat=0;int sit=0;
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
             ListNode tem=head;
             while(tem.next.next!=null)
                 tem=tem.next;
             tem.next=l2;

             while (l2 != null) {
                 int a = 0;
                 sit=2;
                 if (flat==1) {
                     a = 1;}
                 a += l2.val;
                 if (a >= 10) {
                     a = a % 10;
                     flat=1;
                 }  else{
                     flat=0;
                 }
                 l2.val = a;
                 listNode=l2;
                 l2 = l2.next;

             }
         }
         if (l2 == null && l1 != null) {
             ListNode tem=head;
             while(tem.next.next!=null)
                 tem=tem.next;
             tem.next=l1;
             while (l1 != null) {
                 int a = 0;sit=1;
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
                 l1.val = a;
                 l1 = l1.next;
             }
         }
         listNode=head;
         while(listNode.next.next!=null)
             listNode=listNode.next;
         if(flat==0&&listNode.next.val==0){
             listNode.next=null;
         }
         if (flat==1 && sit==0) {
             listNode=head;
             while(listNode.next.next!=null)
                 listNode=listNode.next;
             listNode.next=new ListNode(1,null);
         }
         if (flat==1 && sit!=0){
             listNode=head;
             while(listNode.next!=null)
                 listNode=listNode.next;
             listNode.next=new ListNode(1,null);
         }
//             if (sit==1) {
//
//                 l1=new ListNode(1,null);
//             }
//             if(l2!=null){
//                 l2=new ListNode(1,null);
//             }
//             else{
//                 listNode=new ListNode(1,null);
//             }

         head = head.next;
         return head;
     }
 }

