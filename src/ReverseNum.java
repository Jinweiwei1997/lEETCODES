public class ReverseNum {
    public static void main(String[] args) {
        Solution7 solution=new Solution7();
        int x=solution.reverse(-2147483648);
        System.out.println(x);
    }
}
class Node{
    public
        Node next;
        int value;
        public Node(){};
        }
class Solution7 {
    public int reverse(int x) {
        int Total=0;int flat=1;
        if(x==0||x==-2147483648)
            return 0;
        Node node=new Node();
        Node point=node;
        if(x<0) {
            node.value = 11;
            x=-x;
        }
        int Number=0; //表示几位数
        while(x!=0){
            int temp=x%10;
            Node nodeT=new Node();
            nodeT.value=temp;
            point.next=nodeT;
            point=point.next;
            x/=10;
            Number++;
        }
        int MultiTen=1;
        while(Number!=1){
            MultiTen*=10;
            Number--;
        }
        point=node;
        if(point.value==11){
            flat=0;//表示负数
            point=point.next;
        }else{
            point=point.next;
        }
        int MM=MultiTen;
        while(point!=null){
            if(MultiTen==1000000000 && point.value>2 ||(MM==1000000000 && MultiTen==10 &&point.value>4) )
                return 0;
            Total+=MultiTen*point.value;
            MultiTen/=10;
            point=point.next;
        }
        if(flat==0){
            Total=-Total;
        }
        return Total;
    }
}
