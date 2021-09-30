import java.util.Stack;

/**
 *
 */
public class backWord {
    public static  void main(String args[]){
        Solution9 solution=new Solution9();
        boolean x=solution.isPalindrome(-121);
        System.out.println(x);
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        Stack<Integer>stack =new Stack<Integer>();
        boolean flat=true;
        try {
            if (x < 0)
                return false;
        }catch (Exception e) {return  false;}
        String st=String.valueOf(x);
        int len=st.length();
        for(int i=0;i<len/2;i++){
            int a=x%10;
            stack.push(a);
            x/=10;
        }
        int i=0;
        if(len%2!=0) {i=len/2+1;x/=10;}
        else i=len/2;
        for(;i<len;i++){
            int a=x%10;
            if(a!=stack.pop()) {
                flat=false;
            }
            x/=10;
        }
        return flat;
    }
}

