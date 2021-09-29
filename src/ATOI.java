public class ATOI {
    public static void main(String[] args) {
        Solution8 solution=new Solution8();
        int a=solution.myAtoi("4847483646");
        System.out.println(a);
    }
}
class Solution8 {
    public int myAtoi(String s) {
        int x=0;int flat=1;
        StringBuffer stringBuffer=new StringBuffer();
        int i=0;
        for(;i<s.length();i++)
            if(s.charAt(i)!=' ')
                break;
        if(i==s.length())
            return 0;
        if(s.charAt(i)=='+')
            flat=1;
        else if (s.charAt(i)=='-')
            flat=0;
        else i--;
        //进行判断是不是0
        i++;
        for(;i<s.length();i++)
            if(s.charAt(i)!='0')
                break;
        if(i==s.length()){
            return 0;
        }else {
            for(;i<s.length();i++){
                if(s.charAt(i)=='0')
                    stringBuffer.append('0');
                else if(s.charAt(i)=='1')
                    stringBuffer.append('1');
                else if(s.charAt(i)=='2')
                    stringBuffer.append('2');
                else if(s.charAt(i)=='3')
                    stringBuffer.append('3');
                else if(s.charAt(i)=='4')
                    stringBuffer.append('4');
                else if(s.charAt(i)=='5')
                    stringBuffer.append('5');
                else if(s.charAt(i)=='6')
                    stringBuffer.append('6');
                else if(s.charAt(i)=='7')
                    stringBuffer.append('7');
                else if(s.charAt(i)=='8')
                    stringBuffer.append('8');
                else  if(s.charAt(i)=='9')
                    stringBuffer.append('9');
                else
                    break;
            }
            if (stringBuffer.toString().isEmpty())
                return 0;
            String st=stringBuffer.toString();
            if(st.equals("2147483648") && flat==0) return -2147483648;
            if(flat==1 && (st.length()>10 )){
                return 2147483647;
            }else if(flat==0 && (st.length()>10)) return -2147483648;
            else{
                try {
                    x = Integer.parseInt(st);
                    if (flat == 0) {
                        x = -x;
                    }
                }catch(Exception e){
                    if(flat==0) return -2147483648;
                    else return 2147483647;
                }
            }
    }
        return x;
    }
}